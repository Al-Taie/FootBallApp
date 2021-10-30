package com.watermelon.footballapp.ui.team

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.watermelon.footballapp.model.repository.FootBallRepository

class TeamViewModel : ViewModel() {
    private val repository = FootBallRepository()

    val team = repository.getTeamById(20).asLiveData()

}