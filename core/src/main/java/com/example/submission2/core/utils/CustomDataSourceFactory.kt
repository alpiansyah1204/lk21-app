package com.example.submission2.core.utils

import androidx.lifecycle.MutableLiveData
import androidx.paging.DataSource

class CustomDataSourceFactory<T> (private val data: List<T>) : DataSource.Factory<Int,T>() {
    private val liveData = MutableLiveData<CustomDataSource<T>>()

    override fun create(): DataSource<Int, T> {
        val source = CustomDataSource(data)
        liveData.postValue(source)
        return source
    }

}