package com.watermelon.footballapp.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.watermelon.footballapp.model.repository.FootBallRepository
import com.watermelon.footballapp.ui.match.MatchInteractionListener
import com.watermelon.footballapp.ui.team.TeamInteractionListener

class HomeViewModel() : ViewModel(), MatchInteractionListener,TeamInteractionListener {
    lateinit var navigator: HomeNavigator
    val matches = FootBallRepository.getMatches().asLiveData()

    override fun onMatchClicked(id: Int) {
        navigator.navigateToMatch(id)
    }

    override fun onTeamClicked(id: Int) {
        navigator.navigateToTeam(id)
    }

}