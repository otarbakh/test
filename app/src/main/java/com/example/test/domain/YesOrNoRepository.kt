package com.example.test.domain

import com.example.test.models.YesOrNoResponse

interface YesOrNoRepository {

 suspend fun getYesOrNoAnswer():YesOrNoResponse

}
