package com.watermelon.footballapp.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.watermelon.footballapp.model.State
import com.watermelon.footballapp.model.repository.FootBallRepository
import com.watermelon.footballapp.model.response.match.SingleMatchResponse
import com.watermelon.footballapp.ui.home.HomeNavigator
import com.watermelon.footballapp.ui.match.MatchInteractionListener
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class HomeViewModel() : ViewModel(), MatchInteractionListener {
    private val repository = FootBallRepository()
    lateinit var navigator: HomeNavigator
    val matches = repository.getMatches().asLiveData()
    val singleMatch = MutableLiveData<State<SingleMatchResponse?>>()

    override fun onItemClicked(id: Int) {
        viewModelScope.launch {
            repository.getSingleMatch(id).collect {
                singleMatch.postValue(it)
            }
        }
        navigator.navigateToMatch()
    }
}