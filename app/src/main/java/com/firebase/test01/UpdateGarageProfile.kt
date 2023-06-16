package com.firebase.test01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.firebase.test01.databinding.ActivityMainBinding
import com.google.android.material.button.MaterialButton
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class UpdateGarageProfile : AppCompatActivity() {
    private  lateinit var binding: ActivityMainBinding
    private var firebaseDatabase: FirebaseDatabase?=null
    private var databaseReference: DatabaseReference?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val backToGarage = findViewById<Button>(R.id.btnBackGarge)
        backToGarage.setOnClickListener {
            val intent = Intent(this, GarageDashBoard::class.java)
            startActivity(intent)
        }
    }
}