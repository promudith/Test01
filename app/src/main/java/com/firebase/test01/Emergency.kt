package com.firebase.test01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.firebase.test01.ui.emergency.EmergencyFragment

class Emergency : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, EmergencyFragment.newInstance())
                .commitNow()
        }
    }
}