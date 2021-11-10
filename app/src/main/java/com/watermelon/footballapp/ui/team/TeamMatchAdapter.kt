package com.watermelon.footballapp.ui.team

import com.watermelon.footballapp.model.response.teamMatches.TeamMatch
import com.watermelon.footballapp.ui.base.BaseAdapter
import com.watermelon.footballapp.ui.match.MatchInteractionListener
import watermelon.footballapp.R

class TeamMatchAdapter(list: List<TeamMatch>, listener: MatchInteractionListener) :
    BaseAdapter<TeamMatch>(list, listener) {
    override val layoutID = R.layout.item_team_matches
}
