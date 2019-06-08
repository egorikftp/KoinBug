package com.egoriku.testapplication

import android.app.Application
import com.egoriku.testapplication.fragment.CrashFragment
import com.egoriku.testapplication.service.IService
import com.egoriku.testapplication.service.MyService
import com.egoriku.testapplication.viewmodel.TestViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.core.qualifier.named
import org.koin.dsl.module

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApplication)
            androidLogger()
            modules(myModule)
        }
    }
}

val myModule = module {
    scope(named<CrashFragment>()) {
        scoped<IService> { MyService() }

        viewModel { TestViewModel(get()) }
    }
}