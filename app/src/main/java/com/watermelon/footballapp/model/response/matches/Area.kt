package com.watermelon.footballapp.model.response.matches


import com.google.gson.annotations.SerializedName

data class Area(
    @SerializedName("code")
    val code: String?,
    @SerializedName("ensignUrl")
    val ensignUrl: String?,
    @SerializedName("name")
    val name: String?
)