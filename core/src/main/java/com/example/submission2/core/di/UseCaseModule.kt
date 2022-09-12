package com.example.submission2.core.di

import com.example.submission2.core.domain.usecase.MovieUseCase
import com.example.submission2.core.domain.usecase.TVUseCase
import org.koin.dsl.module

val useCaseModule = module{
    single{ MovieUseCase(get()) }
    single{ TVUseCase(get()) }
}