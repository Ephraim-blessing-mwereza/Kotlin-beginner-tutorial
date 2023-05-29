package com.example.beginner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class RecyclerViewTutorial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view_tutorial)

        // called recyclerview because only visible views will be loaded and the rest will be recycled
    }
}