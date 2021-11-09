package com.watermelon.footballapp.ui.match

import com.watermelon.footballapp.model.response.matches.Match
import com.watermelon.footballapp.ui.base.BaseAdapter
import com.watermelon.footballapp.ui.match.MatchInteractionListener
import watermelon.footballapp.R

class MatchAdapter(list: List<Match>, listener: MatchInteractionListener) :
    BaseAdapter<Match>(list, listener) {
    override val layoutID = R.layout.item_match
}