package com.watermelon.footballapp.ui.player

import androidx.lifecycle.*
import com.watermelon.footballapp.model.State
import com.watermelon.footballapp.model.repository.FootBallRepository
import com.watermelon.footballapp.model.response.player.PlayerRespopnse
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class PlayerViewModel : ViewModel() {

    private val _player = MutableLiveData<State<PlayerRespopnse?>>()
    val player : LiveData<State<PlayerRespopnse?>>
        get() = _player

    fun getPlayerById(playerId : Int){
        viewModelScope.launch {
            FootBallRepository.getPlayerById(playerId).collect {
                _player.postValue(it)
            }
        }
    }

}