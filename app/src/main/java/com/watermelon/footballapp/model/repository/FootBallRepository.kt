package com.watermelon.footballapp.model.repository

import com.watermelon.footballapp.model.State
import com.watermelon.footballapp.model.match.MatchResponse
import com.watermelon.footballapp.model.networking.API
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.Response

class FootBallRepository {

    suspend fun getMatches() : Flow<State<MatchResponse?>> {
        return wrapWithFlow(API.apiService::getMatches)
    }


    private fun <T> wrapWithFlow(function : suspend () -> Response<T>) : Flow<State<T?>> {
        return flow {
            emit(State.Loading)
            try {
                val result = function()
                if (result.isSuccessful){
                    emit(State.Success(result.body()))
                } else {
                    emit(State.Error(result.message()))
                }
            } catch (e:Exception){
                emit(State.Error(e.message.toString()))
            }
        }
    }
}