package com.example.submission2.core.di


import com.example.submission2.core.data.MovieRepository
import com.example.submission2.core.data.TVRepository
import org.koin.dsl.module

val repositoryModule = module{
    single{ MovieRepository(get(),get()) }
    single{ TVRepository(get(),get()) }
}