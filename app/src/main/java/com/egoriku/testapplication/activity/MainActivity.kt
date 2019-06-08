package com.egoriku.testapplication.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.egoriku.testapplication.R
import com.egoriku.testapplication.fragment.CrashFragment
import kotlinx.android.synthetic.main.activity_main.*

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