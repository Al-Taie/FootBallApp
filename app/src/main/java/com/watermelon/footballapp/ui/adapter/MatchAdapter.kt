package com.watermelon.footballapp.ui.adapter

import com.watermelon.footballapp.model.response.match.Match
import com.watermelon.footballapp.ui.base.BaseAdapter
import com.watermelon.footballapp.ui.match.MatchInteractionListener
import watermelon.footballapp.R

class MatchAdapter(list: List<Match>, listener: MatchInteractionListener) :
    BaseAdapter<Match>(list, listener) {
    override val layoutID = R.layout.match_item
}