package com.watermelon.footballapp.model.response.scorers


import com.google.gson.annotations.SerializedName

data class Scorer(
    val numberOfGoals: Int? = null,
    val player: Player? = null,
    val team: Team? = null
)