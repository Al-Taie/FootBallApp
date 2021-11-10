package com.watermelon.footballapp.model.response.teamMatches


data class TeamMatchesResponse(
    val count: Int? = null,
    val filters: Filters? = null,
    val matches: List<TeamMatch>? = null
)