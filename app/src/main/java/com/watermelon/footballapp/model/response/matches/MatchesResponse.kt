package com.watermelon.footballapp.model.response.matches


import com.google.gson.annotations.SerializedName

data class MatchesResponse(
    @SerializedName("count")
    val count: Int?,
    @SerializedName("filters")
    val filters: Filters?,
    @SerializedName("matches")
    val matches: List<Match>?
)