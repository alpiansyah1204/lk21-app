package com.example.submission2.core.data.model.tv

import com.google.gson.annotations.SerializedName

data class RatingTVResponse (
    @SerializedName("results") val results : ArrayList<ResultsRatingTVResponse>,
    @SerializedName("id") val id : Int
)