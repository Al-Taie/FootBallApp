package com.watermelon.footballapp.model.response.teamMatches


import com.google.gson.annotations.SerializedName

data class Filters(
    @SerializedName("limit")
    val limit: Int?,
    @SerializedName("permission")
    val permission: String?
)