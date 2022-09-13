package com.example.test.di

import com.example.test.domain.YesOrNoRepository
import com.example.test.models.YesOrNoResponse
import com.example.test.network.YesOrNoApi
import retrofit2.Response
import javax.inject.Inject

class YesOrNoRepoImpl @Inject constructor(
    private val yesOrNoApi: YesOrNoApi
):YesOrNoRepository {
    override suspend fun getYesOrNoAnswer(): YesOrNoResponse {
        return yesOrNoApi.getYesOrNo()
    }

}
