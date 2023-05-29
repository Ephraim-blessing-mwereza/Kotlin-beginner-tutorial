package com.example.beginner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class TextViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_view)

        val btnCount = findViewById<Button>(R.id.btnCount)
        var count = 0

        btnCount.setOnClickListener {
            count++
            var tvCount = findViewById<TextView>(R.id.tvCount)
            tvCount.text = "Let's count together: $count"

        }
    }
}