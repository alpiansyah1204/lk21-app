package com.example.submission2.core.presentation.model.tv

import com.google.gson.annotations.SerializedName

data class ResultTV(
    @SerializedName("total_pages") val totalPages: Int,
    @SerializedName("results") val result: ArrayList<SearchTV>
)