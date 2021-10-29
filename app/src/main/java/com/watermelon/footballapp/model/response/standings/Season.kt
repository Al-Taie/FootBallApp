package com.watermelon.footballapp.model.response.standings


import com.google.gson.annotations.SerializedName

data class Season(
    val currentMatchday: Int? = null,
    val endDate: String? = null,
    val id: Int? = null,
    val startDate: String? = null,
    val winner: Any? = null
)