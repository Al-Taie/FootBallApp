package com.watermelon.footballapp.model.response.teamMatches


import com.google.gson.annotations.SerializedName

data class Competition(
    @SerializedName("area")
    val area: Area?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("name")
    val name: String?
)