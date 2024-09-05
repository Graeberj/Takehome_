package com.graeberj.takehome_.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Api {
    private const val BASE_URL = "https://fetch-hiring.s3.amazonaws.com/"

    val itemService: ItemService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ItemService::class.java)
    }
}