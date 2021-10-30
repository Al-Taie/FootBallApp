package com.watermelon.footballapp.model.response.scorers


import com.google.gson.annotations.SerializedName

data class Competition(
    val area: Area? = null,
    val code: String? = null,
    val id: Int? = null,
    val lastUpdated: String? = null,
    val name: String? = null,
    val plan: String? = null
)