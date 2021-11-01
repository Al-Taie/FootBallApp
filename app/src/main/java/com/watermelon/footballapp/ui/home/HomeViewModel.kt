package com.watermelon.footballapp.ui.home

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.watermelon.footballapp.model.repository.FootBallRepository
import com.watermelon.footballapp.ui.match.MatchInteractionListener
import com.watermelon.footballapp.ui.team.TeamInteractionListener

class HomeViewModel() : ViewModel(), MatchInteractionListener,TeamInteractionListener {
    val matches = FootBallRepository.getMatches().asLiveData()
    val singleMatchId = MutableLiveData<Event<Int>>()

    override fun onMatchClicked(id: Int) {
        singleMatchId.postValue(Event(id))
    //navigator.navigateToMatch(id)
    }

    override fun onTeamClicked(id: Int) {
        //navigator.navigateToTeam(id)
    }

}