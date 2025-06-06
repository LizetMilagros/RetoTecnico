package com.example.prueba.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.prueba.model.Product

@Database(entities = [Product::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun productDao(): ProductDao
}
