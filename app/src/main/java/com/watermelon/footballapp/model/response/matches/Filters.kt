package com.watermelon.footballapp.model.response.matches


import com.google.gson.annotations.SerializedName

data class Filters(
    @SerializedName("dateFrom")
    val dateFrom: String?,
    @SerializedName("dateTo")
    val dateTo: String?,
    @SerializedName("permission")
    val permission: String?
)