package com.example.submission2.core.di

import com.example.submission2.core.data.local.source.MovieLocalDataSource
import com.example.submission2.core.data.local.source.TVLocalDataSource
import com.example.submission2.core.data.remote.source.MovieRemoteDataSource
import com.example.submission2.core.data.remote.source.TVRemoteDataSource
import org.koin.dsl.module

val dataSourceModule = module{
    single{ TVRemoteDataSource(get()) }
    single{ MovieRemoteDataSource(get()) }
    single{ MovieLocalDataSource(get()) }
    single{ TVLocalDataSource(get()) }
}