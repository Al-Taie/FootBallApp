package com.watermelon.footballapp.ui.home

import androidx.lifecycle.*
import com.watermelon.footballapp.model.State
import com.watermelon.footballapp.model.repository.FootBallRepository
import com.watermelon.footballapp.model.response.match.SingleMatchResponse
import com.watermelon.footballapp.utils.Event
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {

    private val _teamId = MutableLiveData<Event<Int>>()
    val teamId : LiveData<Event<Int>>
        get() = _teamId

    fun onTeamClicked(teamId: Int){
        _teamId.postValue(Event(teamId))
    }
}