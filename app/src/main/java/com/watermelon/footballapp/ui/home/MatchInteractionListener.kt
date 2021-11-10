package com.watermelon.footballapp.ui.home

import com.watermelon.footballapp.ui.base.BaseInteractionListener

interface MatchInteractionListener : BaseInteractionListener {
    fun onMatchClicked(id: Int)
}