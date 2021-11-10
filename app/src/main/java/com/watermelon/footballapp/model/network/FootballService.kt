package com.watermelon.footballapp.model.network

import com.watermelon.footballapp.model.response.competition.SingleCompetitionResponse
import com.watermelon.footballapp.model.response.competitionMatches.CompetitionMatchesResponse
import com.watermelon.footballapp.model.response.competitions.CompetitionsResponse
import com.watermelon.footballapp.model.response.match.SingleMatchResponse
import com.watermelon.footballapp.model.response.matches.MatchesResponse
import com.watermelon.footballapp.model.response.player.PlayerRespopnse
import com.watermelon.footballapp.model.response.scorers.ScorersResponse
import com.watermelon.footballapp.model.response.standings.StandingsResponse
import com.watermelon.footballapp.model.response.team.SingleTeamResponse
import com.watermelon.footballapp.model.response.teamMatches.TeamMatchesResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface FootballService {

    @GET("matches?dateFrom=2021-11-03&dateTo=2021-11-03")
    suspend fun getMatches(): Response<MatchesResponse>

    @GET("matches/{id}")
    suspend fun getSingleMatchById(@Path("id") matchId: Int): Response<SingleMatchResponse>


    @GET("teams/{id}")
    suspend fun getTeamById(@Path("id") teamId: Int): Response<SingleTeamResponse>

    @GET("teams/{teamId}/matches")
    suspend fun getMatchesForTeam(@Path("teamId") teamId:Int) : Response<TeamMatchesResponse>


    @GET("competitions/")
    suspend fun getCompetitions(): Response<CompetitionsResponse>

    @GET("competitions/{id}")
    suspend fun getSingleCompetitionById(@Path("id") competitionId: Int): Response<SingleCompetitionResponse>

    @GET("competitions/{id}/matches")
    suspend fun getCompetitionMatchesById(@Path("id") competitionId: Int): Response<CompetitionMatchesResponse>

    @GET("competitions/{id}/standings")
    suspend fun getCompetitionStandingsById(@Path("id") competitionId: Int): Response<StandingsResponse>

    @GET("competitions/{id}/scorers")
    suspend fun getCompetitionScorersById(@Path("id") competitionId: Int): Response<ScorersResponse>


    @GET("players/{id}")
    suspend fun getPlayerById(@Path("id") playerId: Int): Response<PlayerRespopnse>



}