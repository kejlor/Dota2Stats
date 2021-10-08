package com.example.dota2stats.di

import com.example.dota2stats.models.OpenDotaApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object OpenDotaModule {
    val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("https://api.opendota.com/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(OpenDotaApi::class.java)
    }
}