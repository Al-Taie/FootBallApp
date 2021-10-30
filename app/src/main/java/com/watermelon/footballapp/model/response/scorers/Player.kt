package com.watermelon.footballapp.model.response.scorers


import com.google.gson.annotations.SerializedName

data class Player(
    val countryOfBirth: String? = null,
    val dateOfBirth: String? = null,
    val firstName: String? = null,
    val id: Int? = null,
    val lastName: String? = null,
    val lastUpdated: String? = null,
    val name: String? = null,
    val nationality: String? = null,
    val position: String? = null,
    val shirtNumber: Any? = null
)