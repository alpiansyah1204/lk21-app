package com.example.submission2.favorite.di

import com.example.submission2.favorite.movies.MoviesFavoriteViewModel
import com.example.submission2.favorite.tvshow.TVShowsFavoriteViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val favoriteModule = module {
    viewModel{ MoviesFavoriteViewModel(get()) }
    viewModel{ TVShowsFavoriteViewModel(get()) }
}