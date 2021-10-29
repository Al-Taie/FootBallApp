package com.watermelon.footballapp.model.response.standings


import com.google.gson.annotations.SerializedName

data class StandingsResponse(
    val competition: Competition? = null,
    val filters: Filters? = null,
    val season: Season? = null,
    val standings: List<Standing>? = null
)