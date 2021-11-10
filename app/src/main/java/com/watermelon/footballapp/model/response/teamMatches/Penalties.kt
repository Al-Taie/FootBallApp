package com.watermelon.footballapp.model.response.teamMatches


import com.google.gson.annotations.SerializedName

data class Penalties(
    @SerializedName("awayTeam")
    val awayTeam: Any?,
    @SerializedName("homeTeam")
    val homeTeam: Any?
)