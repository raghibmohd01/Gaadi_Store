package com.example.gaadistore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import com.example.gaadistore.Model.BikesData
import com.example.gaadistore.Model.CarsData


lateinit var listView: ListView

class ListVehicles : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_vehicles)

        listView = findViewById(R.id.lvCar) as ListView


        val s: String? = intent.getStringExtra("List")


        if (s == "Cars") {
            supportActionBar?.title = "Cars"
            val adapter = ArrayAdapter<String>(this, R.layout.list_item, CarsData().cars)
            listView.adapter = adapter


            listView.setOnItemClickListener { parent, view, position, id ->


                Toast.makeText(this, CarsData().cars[position], Toast.LENGTH_SHORT).show()
                val i = Intent(this, VehicleProfile::class.java)
                i.putExtra("Index", position)
                i.putExtra("type", "Cars")
                startActivity(i)

            }
        } else if (s == "Bikes") {
            supportActionBar?.title = "Bikes"
            val adapter = ArrayAdapter<String>(this, R.layout.list_item, BikesData().bikes)
            listView.adapter = adapter

            listView.setOnItemClickListener { parent, view, position, id ->


                Toast.makeText(this, BikesData().bikes[position], Toast.LENGTH_SHORT).show()
                val i = Intent(this, VehicleProfile::class.java)
                i.putExtra("Index", position)
                i.putExtra("type", "Bikes")
                startActivity(i)

            }

        }


    }
}