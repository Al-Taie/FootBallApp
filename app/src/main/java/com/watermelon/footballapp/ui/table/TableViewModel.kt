package com.watermelon.footballapp.ui.table

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.watermelon.footballapp.model.repository.FootBallRepository
import com.watermelon.footballapp.ui.match.MatchNavigator
import com.watermelon.footballapp.ui.team.TeamInteractionListener

class TableViewModel : ViewModel(),TeamInteractionListener {
    private val repository = FootBallRepository()
    lateinit var navigator: TableNavigator
    val standings = repository.getCompetitionStandingsById(2021).asLiveData()
    override fun onTeamClicked(id: Int) {
        navigator.navigateToTeam(id)
    }

}