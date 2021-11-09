package com.watermelon.footballapp.model.response.teamMatches


import com.google.gson.annotations.SerializedName

data class Referee(
    val id: Int? = null,
    val name: String? = null,
    val nationality: String? = null,
    val role: String? = null
)