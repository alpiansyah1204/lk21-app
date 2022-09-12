package com.example.submission2.core.data.model.movie

import com.google.gson.annotations.SerializedName

data class ReleasesResponse (
    @SerializedName("countries") val countries : ArrayList<CountriesResponse>
)