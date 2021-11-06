package com.watermelon.footballapp.model.response.competitionMatches


import com.google.gson.annotations.SerializedName

data class CompetitionMatchesResponse(
    @SerializedName("competition")
    val competition: Competition?,
    @SerializedName("count")
    val count: Int?,
    @SerializedName("filters")
    val filters: Filters?,
    @SerializedName("matches")
    val matches: List<CompetitionMatch>?
)