package com.watermelon.footballapp.model.response.matches


import com.google.gson.annotations.SerializedName

data class Referee(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("nationality")
    val nationality: String?,
    @SerializedName("role")
    val role: String?
)