package com.watermelon.footballapp.ui.adapter

import com.watermelon.footballapp.model.response.competitionMatches.CompetitionMatch
import com.watermelon.footballapp.ui.base.BaseAdapter
import com.watermelon.footballapp.ui.match.MatchInteractionListener
import watermelon.footballapp.R

class CompetitionMatchAdapter(list: List<CompetitionMatch>, listener: MatchInteractionListener) :
    BaseAdapter<CompetitionMatch>(list, listener) {
    override val layoutID = R.layout.item_competition_match
}
