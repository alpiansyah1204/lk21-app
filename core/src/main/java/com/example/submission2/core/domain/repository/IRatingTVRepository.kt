package com.example.submission2.core.domain.repository

import com.example.submission2.core.data.remote.ApiResponse
import com.example.submission2.core.domain.model.tv.RatingTVDomain
import kotlinx.coroutines.flow.Flow

interface IRatingTVRepository {
    suspend fun getRatingTV(id:Int) : Flow<ApiResponse<RatingTVDomain>>
}