package com.watermelon.footballapp.model.response.teamMatches


import com.google.gson.annotations.SerializedName

data class Filters(
    val limit: Int? = null,
    val permission: String? = null
)