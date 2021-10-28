package com.watermelon.footballapp.model.networking

import com.watermelon.footballapp.model.match.MatchResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers

interface FootballService {

    @GET("matches")
    suspend fun getMatches() : Response<MatchResponse>
}