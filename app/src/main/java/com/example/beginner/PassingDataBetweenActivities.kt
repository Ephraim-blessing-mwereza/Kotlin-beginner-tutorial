package com.example.beginner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class PassingDataBetweenActivities : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_passing_data_between_activities)

        val btnApply = findViewById<Button>(R.id.btnApply)
        btnApply.setOnClickListener {
            val name = findViewById<EditText>(R.id.etName).text.toString()
            val age = findViewById<EditText>(R.id.etAge).text.toString().toInt()
            val country = findViewById<EditText>(R.id.etCountry).text.toString()

            // while passing the whole class instead of individual fields
            val person = Person(name, age, country)

            Intent(this, FourthActivity::class.java).also {
                //
                it.putExtra("EXTRA_PERSON",person)
                /*
                // for idividual fields when not using serializable object
                it.putExtra("EXTRA_NAME", name)
                it.putExtra("EXTRA_AGE", age)
                it.putExtra("EXTRA_COUNTRY", country)

                 */
                startActivity(it)
            }
        }

    }
}