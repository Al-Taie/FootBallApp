package com.watermelon.footballapp.model.response.teamMatches


import com.google.gson.annotations.SerializedName

data class TeamMatchesResponse(
    @SerializedName("count")
    val count: Int?,
    @SerializedName("filters")
    val filters: Filters?,
    @SerializedName("matches")
    val matches: List<TeamMatch>?
)