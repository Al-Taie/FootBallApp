package com.watermelon.footballapp.model.response.team


import com.google.gson.annotations.SerializedName

data class Squad(
    val countryOfBirth: String? = null,
    val dateOfBirth: String? = null,
    val id: Int? = null,
    val name: String? = null,
    val nationality: String? = null,
    val position: String? = null,
    val role: String? = null,
    val shirtNumber: Any? = null
)