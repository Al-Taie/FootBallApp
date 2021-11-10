package com.watermelon.footballapp.ui.match

import androidx.lifecycle.*
import com.watermelon.footballapp.model.State
import com.watermelon.footballapp.model.repository.FootBallRepository
import com.watermelon.footballapp.model.response.match.SingleMatchResponse
import com.watermelon.footballapp.utils.Event
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class MatchViewModel : ViewModel() {

    private val _singleMatch = MutableLiveData<State<SingleMatchResponse?>>()
    val singleMatch : LiveData<State<SingleMatchResponse?>>
        get() = _singleMatch

    private val _competitionId = MutableLiveData<Event<Int>>()
    val competitionId : LiveData<Event<Int>>
        get() = _competitionId

    private val _teamId = MutableLiveData<Event<Int>>()
    val teamId : LiveData<Event<Int>>
        get() = _teamId

    fun getMatchById(id:Int) {
        viewModelScope.launch {
            FootBallRepository.getSingleMatch(id).collect {
                _singleMatch.postValue(it)
            }
        }
    }

    fun onCompetitionClicked(competitionId: Int){
        _competitionId.postValue(Event(competitionId))
    }

    fun onTeamClicked(teamId: Int){
        _teamId.postValue(Event(teamId))
    }


}