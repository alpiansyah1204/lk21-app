package com.example.submission2.core.data.model.tv

import com.google.gson.annotations.SerializedName

data class ResultTVResponse(
    @SerializedName("total_pages") val totalPages: Int,
    @SerializedName("results") val result: ArrayList<SearchTVResponse>
)