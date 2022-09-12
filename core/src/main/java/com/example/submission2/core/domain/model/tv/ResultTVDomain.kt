package com.example.submission2.core.domain.model.tv

import com.google.gson.annotations.SerializedName

data class ResultTVDomain(
    @SerializedName("total_pages") val totalPages: Int,
    @SerializedName("results") val result: ArrayList<SearchTVDomain>
)
data class SearchTVDomain (
    @SerializedName("name") val name : String,
    @SerializedName("id") val id : Int,
    @SerializedName("vote_average") val vote_average : Double,
    @SerializedName("poster_path") val poster_path : String
)