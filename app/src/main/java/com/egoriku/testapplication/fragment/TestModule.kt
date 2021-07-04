package com.egoriku.testapplication.fragment

import com.egoriku.testapplication.fragment.test.IService
import com.egoriku.testapplication.fragment.test.TestService
import com.egoriku.testapplication.fragment.test.TestViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val testModule = module {
    scope<LoadKoinModuleCrashFragment>() {
        scoped<IService> { TestService() }

        viewModel { TestViewModel(get()) }
    }
}