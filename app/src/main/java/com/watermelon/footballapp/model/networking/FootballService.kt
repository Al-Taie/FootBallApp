package com.watermelon.footballapp.model.networking

import com.watermelon.footballapp.model.response.competition.SingleCompetitionResponse
import com.watermelon.footballapp.model.response.competitions.CompetitionsResponse
import com.watermelon.footballapp.model.response.match.SingleMatchResponse
import com.watermelon.footballapp.model.response.matches.MatchesResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface FootballService {

    @GET("matches")
    suspend fun getMatches(): Response<MatchesResponse>

    @GET("matches/{id}")
    suspend fun getSingleMatchById(@Path("id") matchId: Int): Response<SingleMatchResponse>

    @GET("competitions/")
    suspend fun getCompetitions() : Response<CompetitionsResponse>

    @GET("competitions/{id}")
    suspend fun getSingleCompetitionById(@Path("id") competitionId: Int): Response<SingleCompetitionResponse>

}