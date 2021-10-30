package com.watermelon.footballapp.ui.player

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.watermelon.footballapp.model.repository.FootBallRepository

class PlayerViewModel : ViewModel() {
    private val repository = FootBallRepository()

    val player = repository.getPlayerById(20).asLiveData()

}