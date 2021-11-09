package com.watermelon.footballapp.ui.scorers

import com.watermelon.footballapp.ui.base.BaseInteractionListener

interface PlayerInteractionListener: BaseInteractionListener {
    fun onPlayerClicked(playerId: Int)
}