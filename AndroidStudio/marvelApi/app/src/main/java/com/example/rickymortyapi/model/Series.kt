package com.example.rickymortyapi.model


import com.google.gson.annotations.SerializedName
import android.os.Parcelable


data class Series(
    @SerializedName("available")
    val available: Int,
    @SerializedName("collectionURI")
    val collectionURI: String,
    @SerializedName("items")
    val items: List<ItemXX>,
    @SerializedName("returned")
    val returned: Int
)