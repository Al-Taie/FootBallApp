package com.watermelon.footballapp.ui.competition

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.watermelon.footballapp.model.State
import com.watermelon.footballapp.model.repository.FootBallRepository
import com.watermelon.footballapp.model.response.competition.SingleCompetitionResponse
import com.watermelon.footballapp.model.response.competitionMatches.CompetitionMatchesResponse
import com.watermelon.footballapp.model.response.standings.StandingsResponse
import com.watermelon.footballapp.ui.match.MatchInteractionListener
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class CompetitionViewModel : ViewModel(),MatchInteractionListener {
    private val repository = FootBallRepository

    private val _competition = MutableLiveData<State<SingleCompetitionResponse?>>()
    val competition : LiveData<State<SingleCompetitionResponse?>>
        get() = _competition

    private val _competitionMatches = MutableLiveData<State<CompetitionMatchesResponse?>>()
    val competitionMatches : LiveData<State<CompetitionMatchesResponse?>>
        get() = _competitionMatches

    private val _competitionStanding = MutableLiveData<State<StandingsResponse?>>()
    val competitionStanding : LiveData<State<StandingsResponse?>>
        get() = _competitionStanding

    fun getCompetitionMatchesById(competitionId: Int) {
        viewModelScope.launch {
            repository.getCompetitionMatchesById(competitionId).collect {
                _competitionMatches.postValue(it)
            }
        }
    }

    fun getCompetitionById(competitionId : Int) {
        viewModelScope.launch {
            repository.getSingleCompetitionById(competitionId).collect {
                _competition.postValue(it)
            }
        }
    }

    fun getCompetitionStandingById(competitionId: Int) {
        viewModelScope.launch {
            repository.getCompetitionStandingsById(competitionId).collect {
                _competitionStanding.postValue(it)
            }
        }
    }

    override fun onMatchClicked(id: Int) {

    }
}