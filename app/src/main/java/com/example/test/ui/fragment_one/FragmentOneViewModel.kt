package com.example.test.ui.fragment_one

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.test.network.YesOrNoApi
import kotlinx.coroutines.launch

class FragmentOneViewModel : ViewModel() {


    fun getYesOrNo() {
        viewModelScope.launch {
            val yesOrNoApi = RetrofitBuilder.getInstance().create(YesOrNoApi::class.java)
            fun getYesOrNoFromRepo() {
                val result = yesOrNoApi.getYesOrNo()
                if (result.isSuccessful)
                    Log.d("bestboxer", result.body().toString())
            }
        }
    }
}