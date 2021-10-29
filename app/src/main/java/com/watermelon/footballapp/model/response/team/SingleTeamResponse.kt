package com.watermelon.footballapp.model.response.team


import com.google.gson.annotations.SerializedName

data class SingleTeamResponse(
    val activeCompetitions: List<ActiveCompetition>? = null,
    val address: String? = null,
    val area: AreaX? = null,
    val clubColors: String? = null,
    val crestUrl: String? = null,
    val email: String? = null,
    val founded: Int? = null,
    val id: Int? = null,
    val lastUpdated: String? = null,
    val name: String? = null,
    val phone: String? = null,
    val shortName: String? = null,
    val squad: List<Squad>? = null,
    val tla: String? = null,
    val venue: String? = null,
    val website: String? = null
)