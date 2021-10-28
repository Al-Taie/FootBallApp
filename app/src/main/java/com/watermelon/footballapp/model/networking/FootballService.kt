package com.watermelon.footballapp.model.networking

import com.watermelon.footballapp.model.response.match.MatchResponse
import retrofit2.Response
import retrofit2.http.GET

interface FootballService {

    @GET("matches")
    suspend fun getMatches() : Response<MatchResponse>
}