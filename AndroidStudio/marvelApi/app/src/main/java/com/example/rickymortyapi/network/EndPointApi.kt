package com.example.rickymortyapi.network

import com.example.rickymortyapi.model.PersonagensResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface EndPointApi {

    @GET("characters?")
    suspend fun getResponseCharacter(
            @Query("offset") offset: Int?,
            @Query("orderBy") orderBy: String?,
            @Query("ts") ts: String?,
            @Query("hash") hash: String?,
            @Query("apikey") apiKey: String?) : PersonagensResponse

}