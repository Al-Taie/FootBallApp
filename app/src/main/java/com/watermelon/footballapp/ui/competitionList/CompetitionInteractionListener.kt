package com.watermelon.footballapp.ui.competitionList

import com.watermelon.footballapp.ui.base.BaseInteractionListener

interface CompetitionInteractionListener: BaseInteractionListener {
    fun onCompetitionClicked(competitionId: Int)
}