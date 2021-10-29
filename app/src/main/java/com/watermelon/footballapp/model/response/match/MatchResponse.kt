package com.watermelon.footballapp.model.response.match


import com.google.gson.annotations.SerializedName

data class MatchResponse(
    val head2head: Head2head? = null,
    val match: Match? = null
)