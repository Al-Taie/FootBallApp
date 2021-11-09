package com.watermelon.footballapp.ui.scorers

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.watermelon.footballapp.model.State
import com.watermelon.footballapp.model.repository.FootBallRepository
import com.watermelon.footballapp.model.response.scorers.ScorersResponse
import com.watermelon.footballapp.ui.match.MatchInteractionListener
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class ScorersViewModel : ViewModel(), MatchInteractionListener {
    private val _competitionScorers = MutableLiveData<State<ScorersResponse?>>()
    val competitionScorers : LiveData<State<ScorersResponse?>>
        get() = _competitionScorers

    fun getCompetitionScorersById(competitionId: Int){
        viewModelScope.launch {
            FootBallRepository.getCompetitionScorersById(competitionId).collect {
                _competitionScorers.postValue(it)
            }
        }
    }

    override fun onMatchClicked(id: Int) {
        // TODO("Not yet implemented")
    }
}