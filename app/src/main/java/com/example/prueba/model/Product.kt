package com.example.prueba.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.google.gson.annotations.SerializedName
import com.example.prueba.data.Converters

@Entity(tableName = "products")
@TypeConverters(Converters::class)
data class Product(
    @PrimaryKey val id: Int,
    val title: String,
    val price: Double,
    val description: String,
    val category: String,
    val images: List<String>
)