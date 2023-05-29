package com.example.beginner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class ToolBarMenus : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tool_bar_menus)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.miAddContact -> Toast.makeText(this,"You clicked on Add contact",Toast.LENGTH_SHORT).show()
            R.id.miFavorites -> Toast.makeText(this,"You clicked on favorites",Toast.LENGTH_SHORT).show()
            R.id.miSettings -> Toast.makeText(this,"You clicked on settings",Toast.LENGTH_SHORT).show()
            R.id.miClose -> finish()
            R.id.miFeedBack -> Toast.makeText(this,"You clicked on Feedback",Toast.LENGTH_SHORT).show()
        }
        return true
    }
}