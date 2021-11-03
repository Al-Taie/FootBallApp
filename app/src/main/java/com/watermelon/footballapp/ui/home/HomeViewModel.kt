package com.watermelon.footballapp.ui.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.watermelon.footballapp.model.repository.FootBallRepository
import com.watermelon.footballapp.ui.match.MatchInteractionListener
import com.watermelon.footballapp.ui.team.TeamInteractionListener
import com.watermelon.footballapp.utils.Event

class HomeViewModel : ViewModel(), MatchInteractionListener {
    val matches = FootBallRepository.getMatches().asLiveData()

    private val _navigateToTeam = MutableLiveData<Event<Int>>()
    val navigateToTeam : LiveData<Event<Int>> get() = _navigateToTeam

    fun onTeamClicked(id: Int) { _navigateToTeam.value = Event(id) }

    override fun onMatchClicked(id: Int) {
//        navigator.navigateToMatch(id)
    }
}