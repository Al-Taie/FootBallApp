package com.watermelon.footballapp.ui.table

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.watermelon.footballapp.model.repository.FootBallRepository
import com.watermelon.footballapp.ui.team.TeamInteractionListener

class TableViewModel : ViewModel(),TeamInteractionListener {

    override fun onTeamClicked(id: Int) {
    }

}