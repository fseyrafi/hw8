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
    private var MY_SHARED_PREF_NAME = "my_shared_pref"
    private var codNational = ""
    private var codPostal = ""
    private var name = ""
    private var place = ""
    private var drs = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {

            val codNational = binding.NationalCodeET.text.toString().trim { it <= ' ' }
            val sharedPref = getSharedPreferences("myKey", MODE_PRIVATE)
            val editor = sharedPref.edit()
            editor.putString("value", codNational)
            editor.apply()

            val codPostal = binding.postalCodeET.text.toString().trim { it <= ' ' }
            editor.putString("value1", codPostal)
            editor.apply()

            val place = binding.placeOfBirthET.text.toString().trim { it <= ' ' }
            editor.putString("value2", place)
            editor.apply()

            val address = binding.addressET.text.toString().trim { it <= ' ' }
            editor.putString("value3", address)
            editor.apply()

            val gender2 = binding.radioButton.text.toString().trim { it <= ' ' }
            editor.putString("value4", gender2)
            editor.apply()

            val gender1 = binding.radioButton2.text.toString().trim { it <= ' ' }
            editor.putString("value5", gender1)
            editor.apply()

            val intent = Intent (MainActivity@this , MainActivity2 :: class.java)
            startActivity(intent)



            when {
                binding.NationalCodeET.text.toString().length < 10 -> binding.NationalCodeET.error =
                    "???? ?????? ?????????? ???????? ???? ???? ?????? ????????."
                binding.NationalCodeET.text.toString().length > 10 -> binding.NationalCodeET.error =
                    "???? ?????? ?????????? ?????????? ???? ???? ?????? ????????."
                else -> {
                    this.codNational = binding.NationalCodeET.text.toString()

                }
            }
            when {
                binding.placeOfBirthET.text.toString().isEmpty() -> binding.placeOfBirthET.error =
                    "???? ???????? ?????? ???????? ???????????? ??????."
                else -> {
                    this.codPostal = binding.placeOfBirthET.text.toString()

                }
            }
            when {
                binding.fullNameET.text.toString().isEmpty() -> binding.fullNameET.error =
                    "???? ???????? ?????? ???????? ???????????? ??????."

                else -> {
                    name = binding.fullNameET.text.toString()

                }
            }
            when {
                binding.postalCodeET.text.toString().isEmpty() -> binding.postalCodeET.error =
                    "???? ???????? ?????? ???????? ???????????? ??????."

                else -> {
                    this.place = binding.postalCodeET.text.toString()

                }
            }
            when {
                binding.addressET.text.toString().isEmpty() -> binding.addressET.error =
                    "???? ???????? ?????? ???????? ???????????? ??????."

                else -> {
                    this.drs = binding.addressET.text.toString()

                }
            }
        }
    }
}
