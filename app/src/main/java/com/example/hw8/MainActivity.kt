package com.example.hw8

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.NonNull
import androidx.annotation.Nullable
import com.example.hw8.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var NationalCodeET: EditText
    private var codNational = ""
    lateinit var placeOfBirthET: EditText
    private var codPostal = ""
    lateinit var fullNameET: EditText
    private var name = ""
    lateinit var postalCodeET : EditText
    private var place = ""
    lateinit var addressET : EditText
    private var drs = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {

//            val codNational = NationalCodeET.text.toString()
//            val codPostal = placeOfBirthET.text.toString()
//            val place = postalCodeET.text.toString()
//            val drs = addressET.text.toString()
//
            val intent = Intent (MainActivity@this , MainActivity2 :: class.java)
//            intent.putExtra("NationalCode", codNational)
//            intent.putExtra("postalCode", codPostal)
//            intent.putExtra("placeOfBirth", place)
//            intent.putExtra("address", drs)
            startActivity(intent)



            when {
                binding.NationalCodeET.text.toString().length < 10 -> binding.NationalCodeET.error =
                    "کد ملی نباید کمتر از ده رقم باشد."
                binding.NationalCodeET.text.toString().length > 10 -> binding.NationalCodeET.error =
                    "کد ملی نباید بیشتر از ده رقم باشد."
                else -> {
                    this.codNational = binding.NationalCodeET.text.toString()

                }
            }
            when {
                binding.placeOfBirthET.text.toString().isEmpty() -> binding.placeOfBirthET.error =
                    "پر کردن این فیلد اجباری است."
                else -> {
                    this.codPostal = binding.placeOfBirthET.text.toString()

                }
            }
            when {
                binding.fullNameET.text.toString().isEmpty() -> binding.fullNameET.error =
                    "پر کردن این فیلد اجباری است."

                else -> {
                    name = binding.fullNameET.text.toString()

                }
            }
            when {
                binding.postalCodeET.text.toString().isEmpty() -> binding.postalCodeET.error =
                    "پر کردن این فیلد اجباری است."

                else -> {
                    this.place = binding.postalCodeET.text.toString()

                }
            }
            when {
                binding.addressET.text.toString().isEmpty() -> binding.addressET.error =
                    "پر کردن این فیلد اجباری است."

                else -> {
                    this.drs = binding.addressET.text.toString()

                }
            }
        }
    }
}
//https://www.youtube.com/watch?v=uNV_qLfc5Zw