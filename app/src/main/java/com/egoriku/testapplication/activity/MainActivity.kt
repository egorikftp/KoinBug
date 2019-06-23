package com.egoriku.testapplication.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import com.egoriku.testapplication.R
import com.egoriku.testapplication.fragment.CrashFragment
import com.egoriku.testapplication.viewmodel.TestViewModel
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.scope.currentScope
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, CrashFragment(), "CrashFragment")
                .commit()
        }

    }
}