package com.watermelon.footballapp.model.response.match


import com.google.gson.annotations.SerializedName

data class HalfTime(
    val awayTeam: Int? = null,
    val homeTeam: Int? = null
)