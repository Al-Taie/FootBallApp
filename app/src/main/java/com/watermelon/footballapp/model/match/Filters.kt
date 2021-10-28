package com.watermelon.footballapp.model.match


import com.google.gson.annotations.SerializedName

data class Filters(
    @SerializedName("dateFrom")
    val dateFrom: String?,
    @SerializedName("dateTo")
    val dateTo: String?,
    @SerializedName("permission")
    val permission: String?
)