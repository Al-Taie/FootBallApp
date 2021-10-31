package com.watermelon.footballapp.ui.matches

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.watermelon.footballapp.model.repository.FootBallRepository
import com.watermelon.footballapp.ui.match.MatchInteractionListener

class MatchesViewModel : ViewModel() ,MatchInteractionListener {
    lateinit var navigator: MatchesNavigator
    val matches = FootBallRepository.getMatches().asLiveData()

    override fun onMatchClicked(id: Int) {
        navigator.navigateToMatch(id)
    }
}