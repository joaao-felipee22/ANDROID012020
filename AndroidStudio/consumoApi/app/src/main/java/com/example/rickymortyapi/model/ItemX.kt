package com.example.rickymortyapi.model


import com.google.gson.annotations.SerializedName

import android.os.Parcelable


data class ItemX(
    @SerializedName("name")
    val name: String,
    @SerializedName("resourceURI")
    val resourceURI: String
)