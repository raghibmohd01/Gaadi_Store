package com.example.gaadistore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.gaadistore.Model.BikesData
import com.example.gaadistore.Model.CarsData

class VehicleProfile : AppCompatActivity() {
    lateinit var img1:ImageView
    lateinit var img2:ImageView

    lateinit var text1:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vehicle_profile)
        img1=findViewById(R.id.img1) as ImageView
        img2=findViewById(R.id.img2) as ImageView
        text1=findViewById(R.id.text1) as TextView


        val position=intent.getIntExtra("Index",0)
        val type=intent.getStringExtra("type")

        if(type=="Bikes") {
            text1.text = BikesData().bikes[position]
            img1.setImageResource(BikesData().images[position])
            img2.setImageResource(BikesData().images[position+1])
        }
        else if(type=="Cars")
        {
            text1.text = CarsData().cars[position]
            img1.setImageResource(CarsData().images[position])
            img2.setImageResource(CarsData().images[position+1])

        }



    }
}