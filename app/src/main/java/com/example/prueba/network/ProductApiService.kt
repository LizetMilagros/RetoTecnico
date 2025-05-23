package com.example.prueba.network

import retrofit2.http.GET

interface ProductApiService {
    @GET("api/v1/products")
    suspend fun getProducts(): List<ProductResponse>
}