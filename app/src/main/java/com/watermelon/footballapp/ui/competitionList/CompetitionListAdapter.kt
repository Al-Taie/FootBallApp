package com.watermelon.footballapp.ui.competitionList

import com.watermelon.footballapp.model.response.competitions.Competition
import com.watermelon.footballapp.ui.base.BaseAdapter
import com.watermelon.footballapp.ui.match.MatchInteractionListener
import watermelon.footballapp.R

class CompetitionListAdapter(list: List<Competition>, listener: CompetitionInteractionListener) :
    BaseAdapter<Competition>(list, listener) {
    override val layoutID = R.layout.item_competition_list
}