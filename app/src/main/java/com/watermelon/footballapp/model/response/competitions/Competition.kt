package com.watermelon.footballapp.model.response.competitions


import com.google.gson.annotations.SerializedName

data class Competition(
    val area: Area? = null,
    val code: Any? = null,
    val currentSeason: CurrentSeason? = null,
    val emblemUrl: String? = null,
    val id: Int? = null,
    val lastUpdated: String? = null,
    val name: String? = null,
    val numberOfAvailableSeasons: Int? = null,
    val plan: String? = null
)