package com.watermelon.footballapp.viewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.watermelon.footballapp.model.repository.FootBallRepository
import com.watermelon.footballapp.ui.match.MatchInteractionListener

class HomeViewModel : ViewModel(), MatchInteractionListener {
    private val repository = FootBallRepository()
    val matches = repository.getMatches().asLiveData()

    override fun onItemClicked() {
        // TODO("Not yet implemented")
    }

}