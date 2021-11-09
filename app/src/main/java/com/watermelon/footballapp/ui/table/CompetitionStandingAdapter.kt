package com.watermelon.footballapp.ui.table

import com.watermelon.footballapp.model.response.standings.Table
import com.watermelon.footballapp.ui.base.BaseAdapter
import com.watermelon.footballapp.ui.match.MatchInteractionListener
import com.watermelon.footballapp.ui.team.TeamInteractionListener
import watermelon.footballapp.R

class CompetitionStandingAdapter(list: List<Table>, listener: MatchInteractionListener) :
    BaseAdapter<Table>(list, listener) {
    override val layoutID = R.layout.item_team_ranking
}
