package com.watermelon.footballapp.ui.match

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.watermelon.footballapp.model.State
import com.watermelon.footballapp.model.repository.FootBallRepository
import com.watermelon.footballapp.model.response.match.SingleMatchResponse
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class MatchViewModel : ViewModel() {
    private val repository = FootBallRepository()

     val singleMatch = MutableLiveData<State<SingleMatchResponse?>>()

    fun makeRequest(id:Int) {
        viewModelScope.launch {
            repository.getSingleMatch(id).collect {
                singleMatch.postValue(it)
            }
        }
    }
}