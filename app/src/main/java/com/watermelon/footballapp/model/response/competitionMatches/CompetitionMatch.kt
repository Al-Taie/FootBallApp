package com.watermelon.footballapp.model.response.competitionMatches


import com.google.gson.annotations.SerializedName
import java.util.*

data class CompetitionMatch(
    @SerializedName("awayTeam")
    val awayTeam: AwayTeam?,
    @SerializedName("group")
    val group: Any?,
    @SerializedName("homeTeam")
    val homeTeam: HomeTeam?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("lastUpdated")
    val lastUpdated: String?,
    @SerializedName("matchday")
    val matchDay: Int?,
    @SerializedName("odds")
    val odds: Odds?,
    @SerializedName("referees")
    val referees: List<Referee>?,
    @SerializedName("score")
    val score: Score?,
    @SerializedName("season")
    val season: Season?,
    @SerializedName("stage")
    val stage: String?,
    @SerializedName("status")
    val status: String?,
    @SerializedName("utcDate")
    val utcDate: Date?
)