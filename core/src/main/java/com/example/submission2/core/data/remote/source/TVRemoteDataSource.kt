package com.example.submission2.core.data.remote.source

import com.example.submission2.core.data.model.tv.RatingTVResponse
import com.example.submission2.core.data.model.tv.ResultTVResponse
import com.example.submission2.core.data.model.tv.TVResponse
import com.example.submission2.core.data.remote.APIService
import com.example.submission2.core.data.remote.ApiResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class TVRemoteDataSource(private val apiService: APIService){

    suspend fun getDetail(id: Int): Flow<ApiResponse<TVResponse>> {
        return flow {
            try {
                val api = apiService.getTVDetail(id)
                if(api.isSuccessful){
                    emit(ApiResponse.Success(api.body() as TVResponse))
                } else{
                    emit(ApiResponse.Empty)
                }
            } catch(e : Exception){
                emit(ApiResponse.Error(e.toString()))
            }
        }.flowOn(Dispatchers.IO)
    }

    suspend fun getList(page: Int) : Flow<ApiResponse<ResultTVResponse>> {
        return flow {
            try {
                val api = apiService.getTV(page)
                if(api.isSuccessful){
                    emit(ApiResponse.Success(api.body() as ResultTVResponse))
                } else{
                    emit(ApiResponse.Empty)
                }
            } catch(e : Exception){
                emit(ApiResponse.Error(e.toString()))
            }
        }.flowOn(Dispatchers.IO)
    }

    suspend fun getOnAirList(page: Int) : Flow<ApiResponse<ResultTVResponse>> {
        return flow {
            try {
                val api = apiService.getOnAirTV(page)
                if(api.isSuccessful){
                    emit(ApiResponse.Success(api.body() as ResultTVResponse))
                } else{
                    emit(ApiResponse.Empty)
                }
            } catch(e : Exception){
                emit(ApiResponse.Error(e.toString()))
            }
        }.flowOn(Dispatchers.IO)
    }

    suspend fun getTopRatedList(page: Int) : Flow<ApiResponse<ResultTVResponse>> {
        return flow {
            try {
                val api = apiService.getTopRatedTV(page)
                if(api.isSuccessful){
                    emit(ApiResponse.Success(api.body() as ResultTVResponse))
                } else{
                    emit(ApiResponse.Empty)
                }
            } catch(e : Exception){
                emit(ApiResponse.Error(e.toString()))
            }
        }.flowOn(Dispatchers.IO)
    }

    suspend fun getRating(id: Int) : Flow<ApiResponse<RatingTVResponse>> {
        return flow {
            try {
                val api = apiService.getRatingTV(id)
                if(api.isSuccessful){
                    emit(ApiResponse.Success(api.body() as RatingTVResponse))
                } else{
                    emit(ApiResponse.Empty)
                }
            } catch(e : Exception){
                emit(ApiResponse.Error(e.toString()))
            }
        }.flowOn(Dispatchers.IO)
    }
}