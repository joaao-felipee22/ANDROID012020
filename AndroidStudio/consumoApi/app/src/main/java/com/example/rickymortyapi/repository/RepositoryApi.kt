package com.example.rickymortyapi.repository

import com.example.rickymortyapi.model.PersonagensResponse
import com.example.rickymortyapi.network.EndPointApi
import com.example.rickymortyapi.network.RetrofitInit

class RepositoryApi {

    private var url = "https://rickandmortyapi.com/api/"
    private var service = EndPointApi::class

    private val serviceRick = RetrofitInit(url).create(service)

    suspend fun getCharacterService(): PersonagensResponse = serviceRick.getResponseCharacter()

}