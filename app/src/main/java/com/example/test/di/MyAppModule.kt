package com.example.test.di

import com.example.test.network.YesOrNoApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object MyAppModule {
    val baseUrl = "https://yesno.wtf/"
    @Singleton
    @Provides

    fun provideYesOrNo(): YesOrNoApi {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(YesOrNoApi::class.java)
    }
}