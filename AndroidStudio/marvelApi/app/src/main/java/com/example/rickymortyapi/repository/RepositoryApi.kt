package com.example.rickymortyapi.repository

import com.example.rickymortyapi.MD5.Companion.md5
import com.example.rickymortyapi.model.PersonagensResponse
import com.example.rickymortyapi.network.EndPointApi
import com.example.rickymortyapi.network.RetrofitInit

class RepositoryApi {

    private var url = "https://gateway.marvel.com/v1/public/"

    val PUBLIC_KEY : String? = "fe81c0a4bd6c7f00e3df25d68d8d8a92"
    val PRIVATE_KEY: String? ="ceac13aef2089eaf3c704ba9da60cf2156b60912"
    val page: Int? = 1
    val orderBy: String? = "name"

    var ts: String? = java.lang.Long.toString(System.currentTimeMillis() / 1000)
    var hash: String? = md5(ts + PRIVATE_KEY + PUBLIC_KEY)

    private var service = EndPointApi::class

    private val serviceRick = RetrofitInit(url).create(service)

    suspend fun getCharacterService(): PersonagensResponse = serviceRick.getResponseCharacter(
            page, orderBy, ts, hash, PUBLIC_KEY
    )

}