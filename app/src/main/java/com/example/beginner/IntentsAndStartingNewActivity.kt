package com.example.beginner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class IntentsAndStartingNewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intents_and_starting_new)

        val btnOpenActivity = findViewById<Button>(R.id.btnOpenActivity)
        btnOpenActivity.setOnClickListener {

            // creating an instance of an intent
            Intent(this, SecondActivity :: class.java).also {
                startActivity(it)
            }
        }
    }
}