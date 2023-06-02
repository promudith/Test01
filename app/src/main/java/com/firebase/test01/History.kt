package com.firebase.test01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.firebase.test01.ui.history.HistoryFragment

class History : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, HistoryFragment.newInstance())
                .commitNow()
        }
    }
}