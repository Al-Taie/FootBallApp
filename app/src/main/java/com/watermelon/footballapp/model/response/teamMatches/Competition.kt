package com.watermelon.footballapp.model.response.teamMatches


import com.google.gson.annotations.SerializedName

data class Competition(
    val area: Area? = null,
    val id: Int? = null,
    val name: String? = null
)