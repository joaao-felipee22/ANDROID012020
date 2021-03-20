package com.example.rickymortyapi.model


import com.google.gson.annotations.SerializedName

data class PersonagensResponse(
    @SerializedName("info")
    val info: Info,
    @SerializedName("results")
    val results: List<Result>
)