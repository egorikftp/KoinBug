package com.egoriku.testapplication.fragment.test

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TestViewModel(private val service: IService) : ViewModel() {

    val liveData = MutableLiveData<String>().apply {
        value = "Text from Livedata"
    }

    fun testUsage() = service.getDataFromRepository()
}