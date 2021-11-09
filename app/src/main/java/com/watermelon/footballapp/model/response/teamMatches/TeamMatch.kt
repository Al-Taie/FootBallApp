package com.watermelon.footballapp.model.response.teamMatches


import com.google.gson.annotations.SerializedName
import java.util.*

data class TeamMatch(
    val awayTeam: AwayTeam? = null,
    val competition: Competition? = null,
    val group: Any? = null,
    val homeTeam: HomeTeam? = null,
    val id: Int? = null,
    val lastUpdated: String? = null,
    val matchday: Int? = null,
    val odds: Odds? = null,
    val referees: List<Referee>? = null,
    val score: Score? = null,
    val season: Season? = null,
    val stage: String? = null,
    val status: String? = null,
    val utcDate: Date? = null
)