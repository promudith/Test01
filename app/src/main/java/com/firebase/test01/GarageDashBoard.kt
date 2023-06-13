package com.firebase.test01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.button.MaterialButton

class GarageDashBoard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_garage_dash_board)

        val updateGarageProfile = findViewById<MaterialButton>(R.id.btnUpdateProfileGarage)
        updateGarageProfile.setOnClickListener {
            val intent = Intent(this, UpdateGarageProfile::class.java)
            startActivity(intent)
        }
        val garageRequests = findViewById<MaterialButton>(R.id.btnGarageRequests)
        garageRequests.setOnClickListener {
            val intent = Intent(this, RequestFormGarage::class.java)
            startActivity(intent)
        }

        val garageTask = findViewById<MaterialButton>(R.id.btnTask)
        garageTask.setOnClickListener {
            val intent = Intent(this, TaskGarage::class.java)
            startActivity(intent)
        }
        val garagePastRecords = findViewById<MaterialButton>(R.id.btnPastRecords)
        garagePastRecords.setOnClickListener {
            val intent = Intent(this, PastRecordeGarage::class.java)
            startActivity(intent)
        }
    }
}