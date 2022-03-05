package com.example.hw8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.hw8.databinding.ActivityMain2Binding
import com.example.hw8.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.editInformation.setOnClickListener {

            val intent = Intent (MainActivity2@this , MainActivity :: class.java)

            val codNational = binding.codeNational.text.toString().trim { it <= ' ' }
            val sharedPref = getSharedPreferences("myKey", MODE_PRIVATE)
            val editor = sharedPref.edit()
            editor.putString("value", codNational)
            editor.apply()

            val codPostal = binding.codePostal.text.toString().trim { it <= ' ' }
            editor.putString("value1", codPostal)
            editor.apply()

            val place = binding.birthPlace.text.toString().trim { it <= ' ' }
            editor.putString("value2", place)
            editor.apply()

            val address = binding.homeAdress.text.toString().trim { it <= ' ' }
            editor.putString("value3", address)
            editor.apply()

            val gender2 = binding.gender.text.toString().trim { it <= ' ' }
            editor.putString("value4", gender2)
            editor.apply()

            startActivity(intent)
        }
        binding.userET.setOnClickListener {

            val intent = Intent (MainActivity2@this , MainActivity :: class.java)
            startActivity(intent)
          }

        val sharedPreferences = getSharedPreferences("myKey", MODE_PRIVATE)
        val value = sharedPreferences.getString("value", "")
        binding.codeNational.text = "کد ملی  :    ${value} "

        val value1 = sharedPreferences.getString("value1", "")
        binding.codePostal.text = "کد پستی  :    ${value1} "

        val value2 = sharedPreferences.getString("value2", "")
        binding.birthPlace.text = "محل تولد  :    ${value2} "

        val value3 = sharedPreferences.getString("value3", "")
        binding.homeAdress.text = "آدرس  :    ${value3} "

        val value4 = sharedPreferences.getString("value4", "")
        binding.gender.text = "جنسیت  :    ${value4} "

        val value5 = sharedPreferences.getString("value5", "")
        binding.gender.text = "جنسیت  :    ${value5} "
    }
}
//https://www.tutorialspoint.com/how-to-pass-data-from-one-activity-to-another-in-android-using-shared-preferences