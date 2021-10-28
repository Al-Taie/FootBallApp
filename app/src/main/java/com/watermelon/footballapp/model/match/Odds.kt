package com.watermelon.footballapp.model.match


import com.google.gson.annotations.SerializedName

data class Odds(
    @SerializedName("msg")
    val msg: String?
)