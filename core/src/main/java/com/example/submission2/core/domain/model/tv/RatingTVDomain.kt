package com.example.submission2.core.domain.model.tv

import com.google.gson.annotations.SerializedName

data class RatingTVDomain (
    @SerializedName("results") val results : ArrayList<ResultsRatingTVDomain>,
    @SerializedName("id") val id : Int
)
data class ResultsRatingTVDomain (
    @SerializedName("iso_3166_1") val iso_3166_1 : String,
    @SerializedName("rating") val rating : String
)