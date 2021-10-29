package com.watermelon.footballapp.model.response.match


import com.google.gson.annotations.SerializedName

data class Winner(
    val crestUrl: String? = null,
    val id: Int? = null,
    val name: String? = null,
    val shortName: String? = null,
    val tla: String? = null
)