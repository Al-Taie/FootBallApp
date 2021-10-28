package com.watermelon.footballapp.model.networking

import com.watermelon.footballapp.model.response.match.Match
import com.watermelon.footballapp.model.response.match.MatchResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface FootballService {

    @GET("matches")
    suspend fun getMatches(): Response<MatchResponse>

    @GET("matches/{id}")
    suspend fun getSingleMatch(@Path("id") matchId: Int): Response<Match>
}