package com.watermelon.footballapp.ui.adapter

import com.watermelon.footballapp.model.response.scorers.Scorer
import com.watermelon.footballapp.ui.base.BaseAdapter
import com.watermelon.footballapp.ui.match.MatchInteractionListener
import watermelon.footballapp.R

class CompetitionScorersAdapter(list: List<Scorer>, listener: MatchInteractionListener) :
    BaseAdapter<Scorer>(list, listener) {
    override val layoutID = R.layout.item_competition_scorer
}
