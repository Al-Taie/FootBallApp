package com.watermelon.footballapp.ui.competitionList

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.watermelon.footballapp.model.repository.FootBallRepository
import com.watermelon.footballapp.utils.Event

class CompetitionListViewModel: ViewModel(), CompetitionInteractionListener {

    val competitionList = FootBallRepository.getCompetitions().asLiveData()

    private val _competitionId = MutableLiveData<Event<Int>>()
    val competitionId : LiveData<Event<Int>>
        get() = _competitionId

    override fun onCompetitionClicked(competitionId: Int) {
        _competitionId.postValue(Event(competitionId))
    }
}