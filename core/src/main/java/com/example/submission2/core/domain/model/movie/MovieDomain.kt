package com.example.submission2.core.domain.model.movie

import com.example.submission2.core.domain.model.all.GenresDomain
import com.google.gson.annotations.SerializedName

data class MovieDomain (
    @SerializedName("genres") val genres : ArrayList<GenresDomain>,
    @SerializedName("id") val id : Int,
    @SerializedName("overview") val overview : String,
    @SerializedName("poster_path") val poster_path : String,
    @SerializedName("release_date") val release_date : String,
    @SerializedName("runtime") val runtime : Int,
    @SerializedName("title") val title : String,
    @SerializedName("vote_average") val vote_average : Double,
    @SerializedName("vote_count") val vote_count : Int,
    @SerializedName("releases") val releases : ReleasesDomain
)

data class ReleasesDomain (
    @SerializedName("countries") val countries : ArrayList<CountriesDomain>
)
data class CountriesDomain (
    @SerializedName("certification") val certification : String,
    @SerializedName("iso_3166_1") val iso_3166_1 : String
)