package com.firebase.test01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RequestsGarage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_requests_garage)

        val backToGarage = findViewById<Button>(R.id.btnBackGarge)
        backToGarage.setOnClickListener {
            val intent = Intent(this, GarageDashBoard::class.java)
            startActivity(intent)
        }
    }
}