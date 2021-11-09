package com.watermelon.footballapp.ui.table

import com.watermelon.footballapp.ui.base.BaseInteractionListener

interface TableInteractionListener: BaseInteractionListener {
    fun onTeamClicked(teamId : Int)
}