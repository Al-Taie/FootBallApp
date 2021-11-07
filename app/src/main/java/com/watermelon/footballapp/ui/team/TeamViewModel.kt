package com.watermelon.footballapp.ui.team

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.watermelon.footballapp.model.State
import com.watermelon.footballapp.model.networking.API
import com.watermelon.footballapp.model.repository.ApiWrapper
import com.watermelon.footballapp.model.repository.FootBallRepository
import com.watermelon.footballapp.model.response.match.SingleMatchResponse
import com.watermelon.footballapp.model.response.matches.MatchesResponse
import com.watermelon.footballapp.model.response.team.SingleTeamResponse
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class TeamViewModel : ViewModel() {
    val team = MutableLiveData<State<SingleTeamResponse?>>()
    val teamMatches = MutableLiveData<State<MatchesResponse?>>()
    fun makeRequest(id:Int) {
        viewModelScope.launch {
            FootBallRepository.getTeamById(id).collect {
                team.postValue(it)
            }
            FootBallRepository.getMatchesForTeam(id).collect {
                teamMatches.postValue(it)
            }
        }
    }
}