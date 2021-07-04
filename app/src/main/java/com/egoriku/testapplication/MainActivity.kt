package com.egoriku.testapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import com.egoriku.testapplication.fragment.LoadKoinModuleCrashFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.commit {
            replace(R.id.container, LoadKoinModuleCrashFragment(), "LoadKoinModuleCrashFragment")
        }
    }
}