package com.example.rickymortyapi.network

import com.squareup.picasso.OkHttp3Downloader
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import kotlin.reflect.KClass

private val gsonConverter: GsonConverterFactory = GsonConverterFactory.create()
private val interceptor = HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BODY }
private val client = OkHttpClient.Builder().addInterceptor(interceptor).build()


class RetrofitInit(url: String) {

    private val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(gsonConverter)
            .client(client)
            .build()

    fun <T : Any> create(clazz: KClass<T>): T = retrofit.create(clazz.java)
}