package com.watermelon.footballapp.utils

import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.RequestOptions
import com.github.twocoffeesoneteam.glidetovectoryou.GlideToVectorYou
import com.google.android.material.imageview.ShapeableImageView
import com.watermelon.footballapp.model.State
import com.watermelon.footballapp.model.response.competitionMatches.CompetitionMatch
import com.watermelon.footballapp.model.response.match.SingleMatch
import com.watermelon.footballapp.model.response.matches.Match
import com.watermelon.footballapp.ui.base.BaseAdapter
import watermelon.footballapp.R
import java.util.*


@BindingAdapter(value = ["app:items"])
fun <T> setRecyclerItems(view: RecyclerView, items: List<T>?) {
    (view.adapter as BaseAdapter<T>?)?.setItems(items ?: emptyList())
    Log.v("MAIN_ACTIVITY", items.toString())
}

@BindingAdapter(value = ["matchType"])
fun setMatchType(view: TextView, match: Match?) {
    when (match?.status) {
        Constants.MatchType.SCHEDULED -> view.text = match.utcDate?.convertToReadableTime()
        Constants.MatchType.FINISHED -> view.text =
            "${match.score?.fullTime?.homeTeam} - ${match?.score?.fullTime?.awayTeam}"
        Constants.MatchType.IN_PLAY -> view.text =
            "${match.score?.fullTime?.homeTeam} - ${match?.score?.fullTime?.awayTeam}"
        Constants.MatchType.PAUSED -> view.text =
            "${match.score?.fullTime?.homeTeam} - ${match?.score?.fullTime?.awayTeam}"
    }
}

@BindingAdapter(value = ["app:matchDate"])
fun setMatchDate(view: TextView, matchDate: Date?){
    view.text = matchDate?.setDate()
}

@BindingAdapter(value = ["competitionMatchType"])
fun setCompetitionMatchType(view: TextView, match: CompetitionMatch?) {
    when(match?.status) {
        Constants.MatchType.SCHEDULED -> view.text = match.utcDate?.convertToReadableTime()
        Constants.MatchType.FINISHED -> view.text = "${match.score?.fullTime?.homeTeam} - ${match?.score?.fullTime?.awayTeam}"
        Constants.MatchType.IN_PLAY -> view.text = "${match.score?.fullTime?.homeTeam} - ${match?.score?.fullTime?.awayTeam}"
        Constants.MatchType.PAUSED -> view.text = "${match.score?.fullTime?.homeTeam} - ${match?.score?.fullTime?.awayTeam}"
    }
}

@BindingAdapter(value = ["app:matchDay"])
fun setMatchDay(view: TextView, matchDay: Int?){
    if (matchDay != null){
        view.text = "match day: $matchDay"
    } else {
        view.text = ""
    }
}

@BindingAdapter(value = ["homeTeamScore"])
fun setHomeTeamScore(view: TextView, match: SingleMatch?) {
    when (match?.status) {
        Constants.MatchType.SCHEDULED -> view.text = "-"
        else -> view.text = match?.score?.fullTime?.homeTeam.toString()
    }
}

@BindingAdapter(value = ["awayTeamScore"])
fun setAwayTeamScore(view: TextView, match: SingleMatch?) {
    when (match?.status) {
        Constants.MatchType.SCHEDULED -> view.text = "-"
        else -> view.text = match?.score?.fullTime?.awayTeam.toString()
    }
}

@BindingAdapter(value = ["app:matchTime"])
fun setMatchTime(view: TextView, Time: Date?) {
    view.text = Time?.convertToReadableTime()
}

@BindingAdapter(value = ["app:showWhenMatchInPlay"])
fun showWhenMatchInPlay(view: ImageView, MatchType: String?) {
    if (MatchType == Constants.MatchType.IN_PLAY) {
        view.setImageResource(R.drawable.live_icon)
    } else {
        view.visibility = View.INVISIBLE
    }
}

@BindingAdapter(value = ["app:showWhenLoading"])
fun <T> showWhenLoading(view: View, state: State<T>?) {
    view.handleLoadingState(state)
}

@BindingAdapter(value = ["app:showWhenError"])
fun <T> showWhenError(view: View, state: State<T>?) {
    view.handleErrorState(state)
}

@BindingAdapter(value = ["app:showWhenSuccess"])
fun <T> showWhenSuccess(view: View, state: State<T>?) {
    view.handleSuccessState(state)
}

@BindingAdapter(value = ["imageUrl"])
fun setImageUrl(view: ImageView, url: String?){
    GlideToVectorYou.init()
        .with(view.context)
        .requestBuilder
        .load(url)
        .transition(DrawableTransitionOptions.withCrossFade())
        .apply(RequestOptions().centerCrop())
        .into(view)
}