package com.watermelon.footballapp.viewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.watermelon.footballapp.model.repository.FootBallRepository

class TableViewModel : ViewModel() {
    private val repository = FootBallRepository()
    val standings = repository.getCompetitionStandingsById(2021).asLiveData()

}