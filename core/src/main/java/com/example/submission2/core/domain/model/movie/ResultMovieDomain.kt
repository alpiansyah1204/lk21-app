package com.example.submission2.core.domain.model.movie

import com.google.gson.annotations.SerializedName

data class ResultMovieDomain (
    @SerializedName("total_pages") val totalPages: Int,
    @SerializedName("results") val result: ArrayList<SearchMovieDomain>
)
data class SearchMovieDomain (
    @SerializedName("poster_path") val poster_path : String?,
    @SerializedName("id") val id : Int,
    @SerializedName("backdrop_path") val backdrop_path : String?,
    @SerializedName("title") val title : String,
    @SerializedName("vote_average") val vote_average : Double,
)