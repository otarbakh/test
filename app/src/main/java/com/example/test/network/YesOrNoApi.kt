package com.example.test.network

import com.example.test.models.YesOrNoResponse
import retrofit2.Response
import retrofit2.http.GET

interface YesOrNoApi {
    @GET("api")
    suspend fun getYesOrNo() : YesOrNoResponse
}
