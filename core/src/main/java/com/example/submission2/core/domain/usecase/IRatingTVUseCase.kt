package com.example.submission2.core.domain.usecase

import com.example.submission2.core.data.remote.ApiResponse
import com.example.submission2.core.presentation.model.tv.RatingTV
import kotlinx.coroutines.flow.Flow

interface IRatingTVUseCase {
    suspend fun getRatingTV(id:Int) : Flow<ApiResponse<RatingTV>>

}