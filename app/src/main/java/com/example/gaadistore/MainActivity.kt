package com.example.gaadistore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnCar:Button
    lateinit var btnBike:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnBike=findViewById(R.id.btnBike) as Button
        btnCar=findViewById(R.id.btnCar) as Button

        val i=Intent(this,ListVehicles::class.java)
        btnCar.setOnClickListener {

            i.putExtra("List","Cars")
            startActivity(i)
        }
        btnBike.setOnClickListener {

            i.putExtra("List","Bikes")
            startActivity(i)
        }


    }

    override fun onBackPressed() {
        finishAffinity()
    }
}