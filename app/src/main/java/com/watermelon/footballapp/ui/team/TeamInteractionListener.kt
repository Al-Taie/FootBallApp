package com.watermelon.footballapp.ui.team

import com.watermelon.footballapp.ui.base.BaseInteractionListener

interface TeamInteractionListener: BaseInteractionListener {
    fun onTeamClicked(id: Int)
}