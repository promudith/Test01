package com.firebase.test01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.firebase.test01.databinding.ActivityMainBinding
import com.google.android.material.button.MaterialButton
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class GarageDashBoard : AppCompatActivity() {
    private  lateinit var binding: ActivityMainBinding
    private var firebaseDatabase: FirebaseDatabase?=null
    private var databaseReference: DatabaseReference?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val database = Firebase.database
        val myRef = database.getReference("message")

        myRef.setValue("Hello, World!")
        firebaseDatabase= FirebaseDatabase.getInstance()
        databaseReference=firebaseDatabase?.getReference("data")


        binding.btnUpdate.setOnClickListener {
            val shopName=binding.shopName.text.toString()
            val  emailAddress=binding.emailAddress.text.toString()
            val  contactNo=binding.contactNumber.text.toString()
            val password=binding.password.text.toString()
            val confirmpassword=binding.confirmPassword.text.toString()
            val address=binding.address.text.toString()
            val city=binding.city.text.toString()

            databaseReference=firebaseDatabase?.getReference("/garage")
            val  user=Garage(shopName,emailAddress,contactNo,password,confirmpassword,address,city)
            databaseReference?.child(shopName)!!.setValue(user)?.addOnSuccessListener {
                binding.shopName.text?.clear()
                binding.emailAddress.text?.clear()
                binding.contactNumber.text?.clear()
                binding.password.text?.clear()
                binding.confirmPassword.text?.clear()
                binding.address.text?.clear()
                binding.city.text?.clear()

                Toast.makeText(this,"Successfully Saved ", Toast.LENGTH_SHORT).show()
            }?.addOnFailureListener{
                Toast.makeText(this,"Failed ", Toast.LENGTH_SHORT).show()
            }


        }

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