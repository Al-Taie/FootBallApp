package com.watermelon.footballapp.model.response.competitionMatches


import com.google.gson.annotations.SerializedName

data class Area(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("name")
    val name: String?
)