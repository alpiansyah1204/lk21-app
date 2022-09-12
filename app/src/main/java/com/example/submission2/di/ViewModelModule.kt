package com.example.submission2.di

import com.example.submission2.core.domain.usecase.MovieUseCase
import com.example.submission2.core.domain.usecase.TVUseCase
import com.example.submission2.core.presentation.model.movie.Movie
import com.example.submission2.core.presentation.model.tv.TV
import com.example.submission2.presentation.detail.DetailViewModel
import com.example.submission2.presentation.list.movies.MoviesViewModel
import com.example.submission2.presentation.list.tvshow.TVShowsViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import java.lang.ref.WeakReference

val viewmodelModule = module {
    single{MoviesViewModel(get())}
    single{TVShowsViewModel(get())}
    viewModel{(type: String) ->
        if(type == "movies" || type == "localmovies"){
            DetailViewModel<MovieUseCase, Movie>(get(), WeakReference(androidContext()) )
        } else {
            DetailViewModel<TVUseCase, TV>(get(),WeakReference(androidContext()))
        }
    }

}