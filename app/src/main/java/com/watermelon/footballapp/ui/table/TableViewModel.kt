package com.watermelon.footballapp.ui.table

import androidx.lifecycle.*
import com.watermelon.footballapp.model.State
import com.watermelon.footballapp.model.repository.FootBallRepository
import com.watermelon.footballapp.model.response.standings.StandingsResponse
import com.watermelon.footballapp.ui.match.MatchInteractionListener
import com.watermelon.footballapp.ui.team.TeamInteractionListener
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class TableViewModel : ViewModel(), MatchInteractionListener {
    private val _competitionStanding = MutableLiveData<State<StandingsResponse?>>()
    val competitionStanding : LiveData<State<StandingsResponse?>>
        get() = _competitionStanding

    fun getCompetitionStandingById(competitionId: Int) {
        viewModelScope.launch {
            FootBallRepository.getCompetitionStandingsById(competitionId).collect {
                _competitionStanding.postValue(it)
            }
        }
    }

    override fun onMatchClicked(id: Int) {
        // TODO("Not yet implemented")
    }


}