package com.watermelon.footballapp.ui.competition

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.watermelon.footballapp.model.State
import com.watermelon.footballapp.model.repository.FootBallRepository
import com.watermelon.footballapp.model.response.competition.SingleCompetitionResponse
import com.watermelon.footballapp.model.response.competitionMatches.CompetitionMatchesResponse
import com.watermelon.footballapp.model.response.scorers.ScorersResponse
import com.watermelon.footballapp.model.response.standings.StandingsResponse
import com.watermelon.footballapp.ui.match.MatchInteractionListener
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class CompetitionViewModel : ViewModel(),MatchInteractionListener {
    private val repository = FootBallRepository

    private val _competition = MutableLiveData<State<SingleCompetitionResponse?>>()
    val competition : LiveData<State<SingleCompetitionResponse?>>
        get() = _competition


    fun getCompetitionById(competitionId : Int) {
        viewModelScope.launch {
            repository.getSingleCompetitionById(competitionId).collect {
                _competition.postValue(it)
            }
        }
    }



    override fun onMatchClicked(id: Int) {

    }
}