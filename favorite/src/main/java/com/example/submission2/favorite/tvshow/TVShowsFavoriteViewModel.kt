package com.example.submission2.favorite.tvshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.example.submission2.core.domain.usecase.TVUseCase
import com.example.submission2.core.presentation.model.tv.TV
import com.example.submission2.core.utils.CustomDataSourceFactory
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class TVShowsFavoriteViewModel(private val useCase: TVUseCase) : ViewModel() {

    lateinit var data : LiveData<PagedList<TV>>

    fun getData() = viewModelScope.launch(Dispatchers.IO){
        useCase.getFavoriteLocalData().collect {
            val config = PagedList.Config.Builder()
                .setEnablePlaceholders(false)
                .setInitialLoadSizeHint(20)
                .setPageSize(20)
                .setPrefetchDistance(5)
                .build()
            val dataSourceFactory = CustomDataSourceFactory(it)
            data = LivePagedListBuilder(dataSourceFactory,config).build()

        }
    }

    fun deleteAll() = viewModelScope.launch(Dispatchers.IO) {
        useCase.deleteAllLocalData()
    }
}
