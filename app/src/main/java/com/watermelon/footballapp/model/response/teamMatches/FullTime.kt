package com.watermelon.footballapp.model.response.teamMatches


import com.google.gson.annotations.SerializedName

data class FullTime(
    @SerializedName("awayTeam")
    val awayTeam: Int?,
    @SerializedName("homeTeam")
    val homeTeam: Int?
)