package com.watermelon.footballapp.model.response.standings


import com.google.gson.annotations.SerializedName

data class Standing(
    val group: Any? = null,
    val stage: String? = null,
    val table: List<Table>? = null,
    val type: String? = null
)