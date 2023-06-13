package com.firebase.test01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TaskGarage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task_garage)

        val backToGarage = findViewById<Button>(R.id.btnBackTask)
        backToGarage.setOnClickListener {
            val intent = Intent(this, GarageDashBoard::class.java)
            startActivity(intent)
        }
    }
}