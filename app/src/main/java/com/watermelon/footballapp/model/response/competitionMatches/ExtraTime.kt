package com.watermelon.footballapp.model.response.competitionMatches


import com.google.gson.annotations.SerializedName

data class ExtraTime(
    @SerializedName("awayTeam")
    val awayTeam: Any?,
    @SerializedName("homeTeam")
    val homeTeam: Any?
)