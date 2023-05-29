package com.example.beginner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class ImageViewsTutorial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_views_tutorial)

        val btnAddImage = findViewById<Button>(R.id.btnAddImage)
        btnAddImage.setOnClickListener {
            val tvImage = findViewById<ImageView>(R.id.ivImage)
            tvImage.setImageResource(R.drawable.login)
        }
    }
}