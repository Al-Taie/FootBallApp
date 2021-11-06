package com.watermelon.footballapp.ui.match

import androidx.lifecycle.*
import com.watermelon.footballapp.model.State
import com.watermelon.footballapp.model.repository.FootBallRepository
import com.watermelon.footballapp.model.response.match.SingleMatchResponse
import com.watermelon.footballapp.utils.Event
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class MatchViewModel : ViewModel() {
     val singleMatch = MutableLiveData<State<SingleMatchResponse?>>()

    private val _competitionId = MutableLiveData<Event<Int>>()
    val competitionId : LiveData<Event<Int>>
        get() = _competitionId

    fun getMatchById(id:Int) {
        viewModelScope.launch {
            FootBallRepository.getSingleMatch(id).collect {
                singleMatch.postValue(it)
            }
        }
    }

    fun onCompetitionClicked(competitionId: Int){
        _competitionId.postValue(Event(competitionId))
    }


}