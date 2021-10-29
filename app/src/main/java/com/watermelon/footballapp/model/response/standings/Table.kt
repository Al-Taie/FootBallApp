package com.watermelon.footballapp.model.response.standings


import com.google.gson.annotations.SerializedName

data class Table(
    val draw: Int? = null,
    val form: Any? = null,
    val goalDifference: Int? = null,
    val goalsAgainst: Int? = null,
    val goalsFor: Int? = null,
    val lost: Int? = null,
    val playedGames: Int? = null,
    val points: Int? = null,
    val position: Int? = null,
    val team: Team? = null,
    val won: Int? = null
)