package com.example.prueba.di

import android.content.Context
import androidx.room.Room
import com.example.prueba.data.AppDatabase
import com.example.prueba.data.ProductDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext appContext: Context): AppDatabase =
        Room.databaseBuilder(appContext, AppDatabase::class.java, "product_database")
            .fallbackToDestructiveMigration()
            .build()

    @Provides
    fun provideProductDao(db: AppDatabase): ProductDao = db.productDao()
}
