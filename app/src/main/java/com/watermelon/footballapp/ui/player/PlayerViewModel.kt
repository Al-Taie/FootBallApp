package com.watermelon.footballapp.ui.player

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.watermelon.footballapp.model.repository.FootBallRepository

class PlayerViewModel : ViewModel() {
    val player = FootBallRepository.getPlayerById(20).asLiveData()

}