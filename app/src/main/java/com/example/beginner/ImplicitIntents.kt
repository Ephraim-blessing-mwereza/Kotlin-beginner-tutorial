package com.example.beginner

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class ImplicitIntents : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implicit_intents)

        val btnTakePhoto  = findViewById<Button>(R.id.btnTakePhoto)
        btnTakePhoto.setOnClickListener {
            /* using explicit intents
            Intent(this)
            */
            Intent(Intent.ACTION_GET_CONTENT).also {
                it.type = "image/*"
                startActivityForResult(it,0)
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK && requestCode == 0){
            val uri = data?.data
            val ivPhoto = findViewById<ImageView>(R.id.ivPhoto)
            ivPhoto.setImageURI(uri)
        }
    }
}