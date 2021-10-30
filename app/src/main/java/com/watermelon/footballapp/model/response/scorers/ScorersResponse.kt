package com.watermelon.footballapp.model.response.scorers


import com.google.gson.annotations.SerializedName

data class ScorersResponse(
    val competition: Competition? = null,
    val count: Int? = null,
    val filters: Filters? = null,
    val scorers: List<Scorer>? = null,
    val season: Season? = null
)