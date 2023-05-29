package com.example.beginner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
//import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import android.util.Log
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // one major method to access button in kotlin code
        //btnApply

        // one method to access button in kotlin code
        val btnApply = findViewById<Button>(R.id.btnApply)


        btnApply.setOnClickListener {
            val firstName = findViewById<EditText>(R.id.etFirstName)
            firstName.text.toString()
            val lastName = findViewById<EditText>(R.id.etlastName).text.toString()
            val birthDate = findViewById<EditText>(R.id.etBirthDate).text.toString()
            val country = findViewById<EditText>(R.id.etCountry).text.toString()
            Log.d("mainActivity","$firstName $lastName, born on $birthDate, from $country just apply to the fomula")
        }


    }
}