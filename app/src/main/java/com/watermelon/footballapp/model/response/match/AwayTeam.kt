package com.watermelon.footballapp.model.response.match


import com.google.gson.annotations.SerializedName

data class AwayTeam(
    val draws: Int? = null,
    val id: Int? = null,
    val losses: Int? = null,
    val name: String? = null,
    val wins: Int? = null
)