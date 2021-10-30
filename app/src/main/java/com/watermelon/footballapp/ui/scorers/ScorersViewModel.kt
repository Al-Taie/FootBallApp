package com.watermelon.footballapp.ui.scorers

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.watermelon.footballapp.model.repository.FootBallRepository

class ScorersViewModel : ViewModel() {
    private val repository = FootBallRepository()

    val scorers = repository.getCompetitionScorersByCode("SA").asLiveData()

}