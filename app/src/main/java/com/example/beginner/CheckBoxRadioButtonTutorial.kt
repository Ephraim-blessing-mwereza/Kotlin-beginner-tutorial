package com.example.beginner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class CheckBoxRadioButtonTutorial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box_radio_button_tutorial)

        val btnOrder = findViewById<Button>(R.id.btnOrder)
        btnOrder.setOnClickListener {
            val checkedMeaRadioButtonId = findViewById<RadioGroup>(R.id.rgMeat).checkedRadioButtonId
            val meat = findViewById<RadioButton>(checkedMeaRadioButtonId)
            val cheese = findViewById<CheckBox>(R.id.cbCheese).isChecked
            val onions = findViewById<CheckBox>(R.id.cbOnions).isChecked
            val salad = findViewById<CheckBox>(R.id.cbSalad).isChecked
            val orderString = "You order a burger with:\n"+
                    " ${meat.text}"+
                    (if(cheese) "\n Cheese" else "")+
                    (if(onions) "\n Onions" else "")+
                    (if(salad) "\n Salad" else "")
            val tvOrder = findViewById<TextView>(R.id.tvOrder)
            tvOrder.text = orderString
        }
    }
}