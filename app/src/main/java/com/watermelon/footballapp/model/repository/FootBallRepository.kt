package com.watermelon.footballapp.model.repository

import com.watermelon.footballapp.model.networking.API

class FootBallRepository {

    fun getMatches() = ApiWrapper.wrapWithFlow { API.apiService.getMatches() }
    fun getSingleMatch(matchId: Int) =
        ApiWrapper.wrapWithFlow { API.apiService.getSingleMatchById(matchId) }

}