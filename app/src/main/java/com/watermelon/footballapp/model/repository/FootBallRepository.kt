package com.watermelon.footballapp.model.repository

import com.watermelon.footballapp.model.networking.API

class FootBallRepository {

    fun getMatches() = ApiWrapper.wrapWithFlow { API.apiService.getMatches() }
    fun getSingleMatch(matchId: Int) =
        ApiWrapper.wrapWithFlow { API.apiService.getSingleMatchById(matchId) }

    fun getCompetitions() = ApiWrapper.wrapWithFlow { API.apiService.getCompetitions() }
    fun getSingleCompetitionById(competitionId: Int) =
        ApiWrapper.wrapWithFlow { API.apiService.getSingleCompetitionById(competitionId) }

    fun getCompetitionStandingsById(competitionId: Int) =
        ApiWrapper.wrapWithFlow { API.apiService.getCompetitionStandingsById(competitionId) }

    fun getTeamById(teamId: Int) = ApiWrapper.wrapWithFlow { API.apiService.getTeamById(teamId) }
}