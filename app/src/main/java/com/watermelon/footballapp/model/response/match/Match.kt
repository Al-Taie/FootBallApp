package com.watermelon.footballapp.model.response.match


import com.google.gson.annotations.SerializedName

data class Match(
    val awayTeam: AwayTeamX? = null,
    val competition: Competition? = null,
    val group: String? = null,
    val homeTeam: HomeTeamX? = null,
    val id: Int? = null,
    val lastUpdated: String? = null,
    val matchday: Int? = null,
    val odds: Odds? = null,
    val referees: List<Referee>? = null,
    val score: Score? = null,
    val season: Season? = null,
    val stage: String? = null,
    val status: String? = null,
    val utcDate: String? = null,
    val venue: String? = null
)