package com.example.rickymortyapi.network

import com.example.rickymortyapi.model.PersonagensResponse
import retrofit2.http.GET

interface EndPointApi {

    @GET("character")
    suspend fun getResponseCharacter() : PersonagensResponse

    @GET("location")
    suspend fun getResponseLocalization()

    @GET("episode")
    suspend fun getResponseEpisode()

}