package com.example.beginner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FourthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        // while passing data individually while not using clas object
        /*
        val name = intent.getStringExtra("EXTRA_NAME")
        val age = intent.getIntExtra("EXTRA_AGE",0)
        val country = intent.getStringExtra("EXTRA_COUNTRY")

           */
        val person = intent.getSerializableExtra("EXTRA_PERSON") as Person

        /*
        // THIS IS FOr individual data passing
        val personString = "$name is $age years old and lives in $country"
        val tvPerson = findViewById<TextView>(R.id.tvPerson)
        tvPerson.text = personString

         */
        val tvPerson = findViewById<TextView>(R.id.tvPerson)
        tvPerson.text = person.toString()
    }
}