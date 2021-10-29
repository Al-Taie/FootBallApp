package com.watermelon.footballapp.utils

import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.watermelon.footballapp.model.response.match.Match
import com.watermelon.footballapp.ui.base.BaseAdapter

@BindingAdapter(value = ["app:items"])
fun <T> setRecyclerItems(view: RecyclerView, items: List<T>?) {
    (view.adapter as BaseAdapter<T>?)?.setItems(items ?: emptyList())
    Log.v("MAIN_ACTIVITY", items.toString())
}

@BindingAdapter(value = ["matchType"])
fun setMatchType(view: TextView, match: Match?) {
    when(match?.status) {
        "SCHEDULED" -> view.text = match.utcDate
        "FINISHED" -> view.text = "${match.score?.fullTime?.homeTeam} - ${match?.score?.fullTime?.awayTeam}"
    }
}
