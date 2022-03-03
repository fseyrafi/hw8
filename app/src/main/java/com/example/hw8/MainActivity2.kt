package com.example.hw8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.hw8.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val intent = intent
//
//        val codNational = intent.getStringExtra("NationalCode")
//        val place = intent.getStringExtra("placeOfBirth")
//        val codPostal = intent.getStringExtra("postalCode")
//        val drs = intent.getStringExtra("address")
//
//        val codeNational = binding.codeNational.text.toString()
////        val codeNational = findViewById<TextView>(R.id.codeNational)
////        val birthPlace = findViewById<TextView>(R.id.birthPlace)
////        val codePostal = findViewById<TextView>(R.id.codePostal)
////        val homeAdress = findViewById<TextView>(R.id.homeAdress)
//
//        codeNational.text = "کد ملی :   $codNational "
//        birthPlace.text = "محل تولد :   $place "
//        codePostal.text = "کد پستی  :   $codPostal "
//        homeAdress.text = "آدرس :   $drs "
    }
}