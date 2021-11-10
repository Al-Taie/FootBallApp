package com.watermelon.footballapp.model.response.teamMatches


import com.google.gson.annotations.SerializedName

data class FullTime(
    val awayTeam: Int? = null,
    val homeTeam: Int? = null
)