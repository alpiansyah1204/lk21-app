package com.example.submission2.core.data.local.source

import androidx.lifecycle.asFlow
import com.example.submission2.core.data.local.MovieDBDatabase
import com.example.submission2.core.data.model.tv.TVResponse
import kotlinx.coroutines.flow.Flow

class TVLocalDataSource(private val movieDBDatabase: MovieDBDatabase) {

    fun getDatas() : Flow<List<TVResponse>>{
        val data = movieDBDatabase.tvDao().findAllTV()
        return data.asFlow()
    }

    fun getDataDetail() : Flow<List<TVResponse>> {
        val data = movieDBDatabase.tvDao().findAllTV()
        return data.asFlow()
    }

    suspend fun insert(tv: TVResponse) : Long {
        return movieDBDatabase.tvDao().insert(tv)
    }
    suspend fun delete(tv: TVResponse) {
        movieDBDatabase.tvDao().delete(tv)
    }
    suspend fun deleteAll() {
        movieDBDatabase.tvDao().deleteAll()
    }
}