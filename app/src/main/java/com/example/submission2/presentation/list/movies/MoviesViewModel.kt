package com.example.submission2.presentation.list.movies

import androidx.lifecycle.*
import com.example.submission2.core.data.remote.ApiResponse
import com.example.submission2.core.domain.usecase.MovieUseCase
import com.example.submission2.core.presentation.model.movie.SearchMovie
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

class MoviesViewModel(private val useCase: MovieUseCase) : ViewModel() {
    var listData = MutableLiveData<List<SearchMovie>>()
    var isLoading = MutableLiveData<Boolean>()
    var isFound = MutableLiveData<Boolean>()
    private var page = 1
    private var pageNP = 1
    private var pageTR = 1
    private var totalPages = 500
    private var temp = 0

    fun reset(){
        page = 1
        pageNP = 1
        pageTR = 1
        temp = 0
    }

    fun getData() = viewModelScope.launch(Dispatchers.IO){
        try {
            val response = useCase.getPopularRemoteData(page)
            withContext(Dispatchers.Main) {
                temp++
                if(temp == 1) {
                    response.onStart { isLoading.value = true }.catch {
                        isLoading.value = false
                        isFound.value = true
                    }.collect {
                        when (it) {
                            is ApiResponse.Success -> {
                                val data = it.data
                                if (data.result.isNotEmpty()) {
                                    listData.value = data.result
                                    totalPages = data.totalPages
                                    isLoading.value = false
                                    isFound.value = true
                                } else {
                                    isLoading.value = false
                                    isFound.value = false
                                }
                            }
                            is ApiResponse.Empty -> {
                                isLoading.value = false
                                isFound.value = false
                            }
                            else -> {
                                isLoading.value = false
                                isFound.value = false
                            }
                        }
                    }
                }
            }
        } catch (e: Exception) {
            withContext(Dispatchers.Main) {
                isFound.value = false
                isLoading.value = false
            }
        }
    }


    fun onLoadMore(spinner: Int){
        temp = 0
        if(spinner == 1){
            if(page <= totalPages){
                page++
                getData()
            }
        }
    }
}
