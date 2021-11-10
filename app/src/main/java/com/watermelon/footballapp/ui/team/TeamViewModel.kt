package com.watermelon.footballapp.ui.team

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.watermelon.footballapp.model.State
import com.watermelon.footballapp.model.repository.FootBallRepository
import com.watermelon.footballapp.model.response.team.SingleTeamResponse
import com.watermelon.footballapp.model.response.teamMatches.TeamMatchesResponse
import com.watermelon.footballapp.ui.match.MatchInteractionListener
import com.watermelon.footballapp.utils.Event
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class TeamViewModel : ViewModel(),MatchInteractionListener {

    private val _team = MutableLiveData<State<SingleTeamResponse?>>()
    val team : LiveData<State<SingleTeamResponse?>>
        get() = _team

    private val _teamMatches = MutableLiveData<State<TeamMatchesResponse?>>()
    val teamMatches : LiveData<State<TeamMatchesResponse?>>
        get() = _teamMatches

    private val _matchId = MutableLiveData<Event<Int>>()
    val matchId : LiveData<Event<Int>>
        get() = _matchId

    fun getTeamAndTeamMatchesById(id:Int) {
        viewModelScope.launch {
            FootBallRepository.getTeamById(id).collect {
                _team.postValue(it)
            }
            FootBallRepository.getMatchesForTeam(id).collect {
                _teamMatches.postValue(it)
            }
        }
    }

    override fun onMatchClicked(id: Int) {
        _matchId.postValue(Event(id))
    }
}