package com.watermelon.footballapp.model.response.match


import com.google.gson.annotations.SerializedName

data class MatchResponse(
    @SerializedName("count")
    val count: Int?,
    @SerializedName("filters")
    val filters: Filters?,
    @SerializedName("matches")
    val matches: List<Match>?
)