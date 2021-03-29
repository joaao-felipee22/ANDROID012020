package com.example.rickymortyapi.model


import com.google.gson.annotations.SerializedName


data class ItemXXX(
    @SerializedName("name")
    val name: String,
    @SerializedName("resourceURI")
    val resourceURI: String,
    @SerializedName("type")
    val type: String
)