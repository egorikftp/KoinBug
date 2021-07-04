package com.egoriku.testapplication.fragment.test

interface IService {
    fun getDataFromRepository(): String
}

class TestService : IService {

    override fun getDataFromRepository() = "My service"
}