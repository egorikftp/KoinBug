package com.egoriku.testapplication.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.egoriku.testapplication.service.IService

class TestViewModel(private val service: IService) : ViewModel() {

    val liveData = MutableLiveData<String>().apply {
        value = "Text from Livedata"
    }

    fun testUsage() = service.getDataFromRepository()
}