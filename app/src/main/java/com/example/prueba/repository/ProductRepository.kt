package com.example.prueba.repository

import android.util.Log
import com.example.prueba.data.ProductDao
import com.example.prueba.model.Product
import com.example.prueba.network.ProductApiService
import com.example.prueba.network.toProduct
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ProductRepository @Inject constructor(
    private val apiService: ProductApiService,
    private val productDao: ProductDao
) {
    val allProducts: Flow<List<Product>> = productDao.getAll()

    suspend fun refreshProducts() {
        try {
            val productResponses = apiService.getProducts()
            Log.d("Repository", "Productos descargados: ${productResponses.size}")
            val products = productResponses.map { it.toProduct() }
            productDao.insertAll(products)
            Log.d("Repository", "Productos insertados en DB")
        } catch (e: Exception) {
            Log.e("Repository", "Error al obtener productos: ${e.message}", e)
        }
    }

    fun getProductById(id: Int): Flow<Product?> = productDao.getProductById(id)

}