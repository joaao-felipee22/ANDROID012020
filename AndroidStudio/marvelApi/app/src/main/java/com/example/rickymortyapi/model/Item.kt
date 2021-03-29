package com.example.rickymortyapi.model


import com.google.gson.annotations.SerializedName



data class Item(
    @SerializedName("name")
    val name: String,
    @SerializedName("resourceURI")
    val resourceURI: String
)