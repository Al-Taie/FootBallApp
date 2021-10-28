package com.watermelon.footballapp.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.watermelon.footballapp.model.State
import com.watermelon.footballapp.model.match.MatchResponse
import com.watermelon.footballapp.model.repository.FootBallRepository
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {

    private val repository = FootBallRepository()

    val matches = MutableLiveData<State<MatchResponse?>>()

    init {
        getMatches()
    }

    private fun getMatches() {
        viewModelScope.launch {
            repository.getMatches().collect {
                matches.postValue(it)
            }
        }
    }

}