package com.example.gaadistore.Model

import android.content.res.Resources
import com.example.gaadistore.R

data class BikesData(
    val bikes:Array<String> = arrayOf<String>(
    "BMW", "Yamaha YZF-R6",
    "Yamaha YZF-R3",
    "Suzuki GSX-R750",
    "Suzuki Hayabusa",
    "Honda CBR1000RR",
    "Suzuki GSX-R600",
    "Honda CBR300R",
    "Kawasaki Ninja ZX-6R", "Bajaj Pulsar 150", "Honda CB Shine ",
    "Kawasaki Ninja 300",
    "Bajaj Pulsar 125",
    "Honda Activa 5G",
    " Kawasaki Ninja H2R",
    " Royal Enfield Classic 350"
), val images: Array<Int>
=arrayOf<Int>(R.drawable.bmw1,  R.drawable.bike3,R.drawable.bmw2,R.drawable.bike1,R.drawable.bmw4,
            R.drawable.bike1,  R.drawable.bike2,  R.drawable.bike3,  R.drawable.bike4,  R.drawable.bike5,  R.drawable.bike6,  R.drawable.bike7,
            R.drawable.bmw1,  R.drawable.bike4,  R.drawable.bike1,R.drawable.bmw2,R.drawable.bmw3,  R.drawable.bike5,R.drawable.bmw4,R.drawable.bmw1,R.drawable.bike4,  R.drawable.bike1,R.drawable.bmw2,R.drawable.bmw3,R.drawable.bmw4
                    ,R.drawable.bmw1,R.drawable.bmw2,  R.drawable.bike2,R.drawable.bmw3,  R.drawable.bike7,R.drawable.bmw4,  R.drawable.bike1)
)
