package com.example.beginner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.View
import android.widget.Button
import android.widget.Toast

class ToastsAndContext : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toasts_and_context)

        // creating instance o context

        val btnShowToast  = findViewById<Button>(R.id.btnShowToast)
        btnShowToast.setOnClickListener {
           // purpose of the context: many functions require context  of the work
            //Toast.makeText(applicationContext, "Hi, I'm a toast", Toast.LENGTH_LONG).show()

            val clToast = findViewById<View>(R.id.clToast)
            Toast(this).apply {
                duration = Toast.LENGTH_LONG
               /*
               //had issues
               view = layoutInflater.inflate(R.layout.custom_toast, clToast)
                show()

                */
            }
        }
    }
}