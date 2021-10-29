package com.watermelon.footballapp.model.response.match


import com.google.gson.annotations.SerializedName

data class Score(
    val duration: String? = null,
    val extraTime: ExtraTime? = null,
    val fullTime: FullTime? = null,
    val halfTime: HalfTime? = null,
    val penalties: Penalties? = null,
    val winner: String? = null
)