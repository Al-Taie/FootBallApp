package com.watermelon.footballapp.ui.team

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.watermelon.footballapp.model.State
import com.watermelon.footballapp.model.repository.FootBallRepository
import com.watermelon.footballapp.model.response.team.SingleTeamResponse
import com.watermelon.footballapp.model.response.teamMatches.TeamMatchesResponse
import com.watermelon.footballapp.ui.match.MatchInteractionListener
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class TeamViewModel : ViewModel(),MatchInteractionListener {

    val team = MutableLiveData<State<SingleTeamResponse?>>()

    val teamMatches = MutableLiveData<State<TeamMatchesResponse?>>()

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

    override fun onMatchClicked(id: Int) {

    }
}