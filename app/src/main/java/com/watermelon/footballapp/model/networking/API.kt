package com.watermelon.footballapp.model.networking

import com.watermelon.footballapp.utils.FootballInterceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object API {
    private const val baseUrl = "http://api.football-data.org/v2/"
    private val client = OkHttpClient.Builder().addInterceptor(FootballInterceptor()).build()
    private val retrofit = Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build()
    val apiService = retrofit.create(FootballService::class.java)
}