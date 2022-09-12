package com.example.submission2.core.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.submission2.core.data.local.dao.MovieDao
import com.example.submission2.core.data.local.dao.TVDao
import com.example.submission2.core.data.model.movie.MovieResponse
import com.example.submission2.core.data.model.tv.TVResponse
import com.example.submission2.core.utils.Converter

@Database(entities = [MovieResponse::class, TVResponse::class],version = 1,exportSchema = false)
@TypeConverters(Converter::class)
abstract class MovieDBDatabase : RoomDatabase(){
    abstract fun movieDao(): MovieDao
    abstract fun tvDao(): TVDao
}