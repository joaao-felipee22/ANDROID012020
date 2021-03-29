package com.example.rickymortyapi.model


import com.google.gson.annotations.SerializedName

import android.os.Parcelable


data class Comics(
    @SerializedName("available")
    val available: Int,
    @SerializedName("collectionURI")
    val collectionURI: String,
    @SerializedName("items")
    val items: List<Item>,
    @SerializedName("returned")
    val returned: Int
)