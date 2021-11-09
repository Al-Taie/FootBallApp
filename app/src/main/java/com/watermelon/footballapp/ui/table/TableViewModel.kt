package com.watermelon.footballapp.ui.table

import androidx.lifecycle.*
import com.watermelon.footballapp.model.State
import com.watermelon.footballapp.model.repository.FootBallRepository
import com.watermelon.footballapp.model.response.standings.StandingsResponse
import com.watermelon.footballapp.utils.Event
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class TableViewModel : ViewModel(), TableInteractionListener {

    private val _competitionStanding = MutableLiveData<State<StandingsResponse?>>()
    val competitionStanding : LiveData<State<StandingsResponse?>>
        get() = _competitionStanding

    private val _teamId = MutableLiveData<Event<Int>>()
    val teamId : LiveData<Event<Int>>
        get() = _teamId

    fun getCompetitionStandingById(competitionId: Int) {
        viewModelScope.launch {
            FootBallRepository.getCompetitionStandingsById(competitionId).collect {
                _competitionStanding.postValue(it)
            }
        }
    }

    override fun onTeamClicked(teamId: Int) {
        _teamId.postValue(Event(teamId))
    }


}