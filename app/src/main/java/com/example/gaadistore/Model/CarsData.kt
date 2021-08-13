package com.example.gaadistore.Model

import com.example.gaadistore.R


data class CarsData(var cars: Array<String> = arrayOf<String>(
        "Ford F-Series",
        "Chevrolet Silverado",
        "Ram 1500/2500/3500",
        "Toyota RAV4",
        "Honda CR-V",
        "Toyota Camry",
        "Chevrolet Equinox",
        "GMC Sierra",
        "Chevrolet Silverado",
        "Ram 1500/2500/3500",
        "Toyota RAV4",
        "Honda CR-V",
        "Toyota Camry",
        "Chevrolet Equinox",
        "GMC Sierra"
),val images: Array<Int>
                    =arrayOf<Int>(R.drawable.car1, R.drawable.car2, R.drawable.car3,
                R.drawable.car4,R.drawable.car5,R.drawable.car6,R.drawable.car7,R.drawable.car1,R.drawable.car1, R.drawable.car2, R.drawable.car3,
                R.drawable.car4,R.drawable.car5,R.drawable.car6,R.drawable.car7,R.drawable.car1)
)