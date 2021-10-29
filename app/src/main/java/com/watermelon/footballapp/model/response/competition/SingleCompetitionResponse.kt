package com.watermelon.footballapp.model.response.competition


import com.google.gson.annotations.SerializedName

data class SingleCompetitionResponse(
    val area: Area? = null,
    val code: String? = null,
    val currentSeason: CurrentSeason? = null,
    val emblemUrl: Any? = null,
    val id: Int? = null,
    val lastUpdated: String? = null,
    val name: String? = null,
    val plan: String? = null,
    val seasons: List<Season>? = null
)