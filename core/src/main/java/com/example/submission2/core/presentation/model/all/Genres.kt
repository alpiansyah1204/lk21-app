package com.example.submission2.core.presentation.model.all

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Genres (
    @SerializedName("id") val id : Int,
    @SerializedName("name") val name : String
) : Parcelable