package com.watermelon.footballapp.model.response.competition


import com.google.gson.annotations.SerializedName

data class CurrentSeason(
    val currentMatchday: Int? = null,
    val endDate: String? = null,
    val id: Int? = null,
    val startDate: String? = null,
    val winner: Any? = null
)