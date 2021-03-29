package com.example.rickymortyapi.model


import com.google.gson.annotations.SerializedName

import android.os.Parcelable

data class Thumbnail(
    @SerializedName("extension")
    val extension: String,
    @SerializedName("path")
    val path: String
)