package com.watermelon.footballapp.model.response.match


import com.google.gson.annotations.SerializedName

data class Head2head(
    val awayTeam: AwayTeam? = null,
    val homeTeam: HomeTeam? = null,
    val numberOfMatches: Int? = null,
    val totalGoals: Int? = null
)