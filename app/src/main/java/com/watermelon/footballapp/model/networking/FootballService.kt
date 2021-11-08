package com.watermelon.footballapp.model.networking

import com.watermelon.footballapp.model.response.competition.SingleCompetitionResponse
import com.watermelon.footballapp.model.response.competitionMatches.CompetitionMatchesResponse
import com.watermelon.footballapp.model.response.competitions.CompetitionsResponse
import com.watermelon.footballapp.model.response.match.SingleMatchResponse
import com.watermelon.footballapp.model.response.matches.MatchesResponse
import com.watermelon.footballapp.model.response.player.PlayerRespopnse
import com.watermelon.footballapp.model.response.scorers.ScorersResponse
import com.watermelon.footballapp.model.response.standings.StandingsResponse
import com.watermelon.footballapp.model.response.team.SingleTeamResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface FootballService {

    @GET("matches")
    suspend fun getMatches(): Response<MatchesResponse>

    @GET("matches/{id}")
    suspend fun getSingleMatchById(@Path("id") matchId: Int): Response<SingleMatchResponse>

    @GET("competitions/")
    suspend fun getCompetitions(): Response<CompetitionsResponse>

    @GET("competitions/{id}/matches")
    suspend fun getCompetitionMatchesById(@Path("id") competitionId: Int): Response<CompetitionMatchesResponse>

    @GET("competitions/{id}")
    suspend fun getSingleCompetitionById(@Path("id") competitionId: Int): Response<SingleCompetitionResponse>

    @GET("competitions/{id}/standings")
    suspend fun getCompetitionStandingsById(@Path("id") competitionId: Int): Response<StandingsResponse>

    @GET("teams/{id}")
    suspend fun getTeamById(@Path("id") teamId: Int): Response<SingleTeamResponse>

    @GET("players/{id}")
    suspend fun getPlayerById(@Path("id") playerId: Int): Response<PlayerRespopnse>

    @GET("competitions/{id}/scorers")
    suspend fun getCompetitionScorersById(@Path("id") competitionId: Int): Response<ScorersResponse>


}