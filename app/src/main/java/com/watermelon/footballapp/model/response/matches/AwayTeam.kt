package com.watermelon.footballapp.model.response.matches


import com.google.gson.annotations.SerializedName

data class AwayTeam(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("name")
    val name: String?
)