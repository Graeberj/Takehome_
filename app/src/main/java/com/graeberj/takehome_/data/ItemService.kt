package com.graeberj.takehome_.data

import com.graeberj.takehome_.data.model.Item
import retrofit2.http.GET

interface ItemService {
    @GET("hiring.json")
    suspend fun getItems(): List<Item>
}