package com.example.beginner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.os.IResultReceiver._Parcel
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class AlertDialog : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog)

        val btnDialog1 = findViewById<Button>(R.id.btnDialog1)
        val btnDialog2 = findViewById<Button>(R.id.btnDialog2)
        val btnDialog3 = findViewById<Button>(R.id.btnDialog3)

        val addContactDialog = AlertDialog.Builder(this)
            .setTitle("Add Contact")
            .setMessage("Do you want to add Mr. Frank on your contact list")
            .setIcon(R.drawable.ic_add_contact)
            .setPositiveButton("Yes"){ _, _ ->
                Toast.makeText(this,"You added Mr.Frank to your contact list",Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("No"){ _,_ ->
                Toast.makeText(this,"You didn't ad mr Frank to your contact list", Toast.LENGTH_SHORT).show()
            }.create()
        btnDialog1.setOnClickListener {
            addContactDialog.show()
        }

        val options =  arrayOf("First Item", "second Item","Third Item")
        val singleChoiceDialog = AlertDialog.Builder(this)
            .setTitle("Choose Options")
            .setSingleChoiceItems(options,0){dialogInterface, i ->
                Toast.makeText(this, "You clicked on ${options[i]}", Toast.LENGTH_SHORT).show()
            }
            .setPositiveButton("Accept"){ _, _ ->
                Toast.makeText(this,"You accepted the single choice dialog",Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Decline"){ _,_ ->
                Toast.makeText(this,"You declined the single choice dialog", Toast.LENGTH_SHORT).show()
            }.create()

        btnDialog2.setOnClickListener {
            singleChoiceDialog.show()
        }
        val multiChoiceDialog = AlertDialog.Builder(this)
            .setTitle("Choose Options")
            .setMultiChoiceItems(options, booleanArrayOf(false,false,false)) {_Parcel, i,isChecked ->
                if (isChecked){
                    Toast.makeText(this,"you checked ${options[i]}", Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this,"you unchecked ${options[i]}", Toast.LENGTH_SHORT).show()
                }
            }
            .setPositiveButton("Accept"){ _, _ ->
                Toast.makeText(this,"You accepted the MultiChoiceDialog",Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Decline"){ _,_ ->
                Toast.makeText(this,"You declined the MultiChoiceDialog", Toast.LENGTH_SHORT).show()
            }.create()

        btnDialog3.setOnClickListener {
            multiChoiceDialog.show()
        }
    }
}