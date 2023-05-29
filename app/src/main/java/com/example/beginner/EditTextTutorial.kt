package com.example.beginner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class EditTextTutorial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text_tutorial)

        val btnAdd = findViewById<Button>(R.id.btnAdd)
        btnAdd.setOnClickListener {
            val firstNumber  = findViewById<EditText>(R.id.etFirstNumber).text.toString().toInt()
            val secondNumber = findViewById<EditText>(R.id.etSecondNumber).text.toString().toInt()
            val result = firstNumber + secondNumber
            val tvResult = findViewById<TextView>(R.id.tvResult)
            tvResult.text = result.toString()
        }
    }
}