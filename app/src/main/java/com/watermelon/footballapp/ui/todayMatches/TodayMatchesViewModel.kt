package com.watermelon.footballapp.ui.todayMatches

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.watermelon.footballapp.model.repository.FootBallRepository
import com.watermelon.footballapp.ui.match.MatchInteractionListener
import com.watermelon.footballapp.utils.Event

class TodayMatchesViewModel : ViewModel(), MatchInteractionListener {
    val matches = FootBallRepository.getMatches().asLiveData()

    private val _matchId = MutableLiveData<Event<Int>>()
    val matchId : LiveData<Event<Int>>
        get() = _matchId


    override fun onMatchClicked(id: Int) {
        _matchId.postValue(Event(id))
    }
}