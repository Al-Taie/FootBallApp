package com.watermelon.footballapp.model.response.matches


import com.google.gson.annotations.SerializedName

data class Odds(
    @SerializedName("msg")
    val msg: String?
)