package com.example.rickymortyapi.model


import com.google.gson.annotations.SerializedName

import android.os.Parcelable


data class Info(
    @SerializedName("count")
    val count: Int,
    @SerializedName("next")
    val next: String,
    @SerializedName("pages")
    val pages: Int,
    @SerializedName("prev")
    val prev: Any
)