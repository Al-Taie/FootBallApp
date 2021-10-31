package com.watermelon.footballapp.ui.team

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.watermelon.footballapp.model.State
import com.watermelon.footballapp.model.repository.FootBallRepository
import com.watermelon.footballapp.model.response.match.SingleMatchResponse
import com.watermelon.footballapp.model.response.team.SingleTeamResponse
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class TeamViewModel : ViewModel() {
    private val repository = FootBallRepository()

    val team = MutableLiveData<State<SingleTeamResponse?>>()

    fun makeRequest(id:Int) {
        viewModelScope.launch {
            repository.getTeamById(id).collect {
                team.postValue(it)
            }
        }
    }
}