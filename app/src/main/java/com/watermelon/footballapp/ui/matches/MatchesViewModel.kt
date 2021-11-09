package com.watermelon.footballapp.ui.matches

import androidx.lifecycle.*
import com.watermelon.footballapp.model.State
import com.watermelon.footballapp.model.repository.FootBallRepository
import com.watermelon.footballapp.model.response.competitionMatches.CompetitionMatchesResponse
import com.watermelon.footballapp.ui.match.MatchInteractionListener
import com.watermelon.footballapp.utils.Event
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class MatchesViewModel : ViewModel(), MatchInteractionListener {
    val matches = FootBallRepository.getMatches().asLiveData()

    private val _competitionMatches = MutableLiveData<State<CompetitionMatchesResponse?>>()
    val competitionMatches: LiveData<State<CompetitionMatchesResponse?>>
        get() = _competitionMatches

    private val _matchId = MutableLiveData<Event<Int>>()
    val matchId : LiveData<Event<Int>>
        get() =  _matchId

    fun getCompetitionMatchesById(competitionId: Int) {
        viewModelScope.launch {
            FootBallRepository.getCompetitionMatchesById(competitionId).collect {
                _competitionMatches.postValue(it)
            }
        }
    }


    override fun onMatchClicked(id: Int) {
        _matchId.postValue(Event(id))
    }
}