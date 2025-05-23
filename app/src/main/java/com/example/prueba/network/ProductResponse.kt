package com.example.prueba.network

import com.example.prueba.model.Product
import com.google.gson.annotations.SerializedName

data class ProductResponse(
    val id: Int,
    val title: String,
    val price: Double,
    val description: String,
    @SerializedName("category") val category: CategoryResponse,
    val images: List<String>
)

data class CategoryResponse(
    val id: Int,
    val name: String,
    val image: String
)

fun ProductResponse.toProduct(): Product {
    return Product(
        id = id,
        title = title,
        price = price,
        description = description,
        category = category.name,
        images = images
    )
}
