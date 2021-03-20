package com.example.rickymortyapi.model


import com.google.gson.annotations.SerializedName

import android.os.Parcelable


data class Origin(
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
)