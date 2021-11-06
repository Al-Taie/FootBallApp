package com.watermelon.footballapp.ui.competition

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.watermelon.footballapp.model.State
import com.watermelon.footballapp.model.repository.FootBallRepository
import com.watermelon.footballapp.model.response.competitionMatches.CompetitionMatchesResponse
import com.watermelon.footballapp.ui.match.MatchInteractionListener
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class CompetitionViewModel : ViewModel(),MatchInteractionListener {
    private val repository = FootBallRepository

    private val _competitionMatches = MutableLiveData<State<CompetitionMatchesResponse?>>()
    val competitionMatches : LiveData<State<CompetitionMatchesResponse?>>
        get() = _competitionMatches

    fun getCompetitionMatchesById(competitionId: Int){
        viewModelScope.launch {
            repository.getCompetitionMatchesById(competitionId).collect {
                _competitionMatches.postValue(it)
            }
        }
    }

    override fun onMatchClicked(id: Int) {

    }
}