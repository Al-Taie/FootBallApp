package com.watermelon.footballapp.viewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.watermelon.footballapp.model.repository.FootBallRepository

class MatchViewModel : ViewModel() {
    private val repository = FootBallRepository()

    val singleMatch = repository.getSingleMatch(204950).asLiveData()

}