package com.watermelon.footballapp.model.response.competitions


import com.google.gson.annotations.SerializedName

data class CompetitionsResponse(
    val competitions: List<Competition>? = null,
    val count: Int? = null,
    val filters: Filters? = null
)