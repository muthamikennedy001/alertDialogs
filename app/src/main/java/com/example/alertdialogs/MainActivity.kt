package com.example.alertdialogs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val addContactDialog= AlertDialog.Builder(this)
            .setTitle("Add contact")
            .setMessage("Do you want to add Ken to your Contacts")
            .setIcon(R.drawable.ic_add_contact)
            .setPositiveButton("Yes"){ _,_ ->
                Toast.makeText(this, "You added Ken to your contacts",Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("No"){ _,_ ->
                Toast.makeText(this, "You did not Ken to your contacts",Toast.LENGTH_SHORT).show()
            }.create()
        val btnDialog1:Button=findViewById(R.id.btnDialog1)
        btnDialog1.setOnClickListener {
            addContactDialog.show()
        }


        val options=arrayOf("First Item", "Second Item","Third Item")
        val singleChoiceDialog=AlertDialog.Builder(this)
            .setTitle("Choose One Of this Options")
            .setSingleChoiceItems(options, 0){dialogInterface,i->
                Toast.makeText(this,"You clicked on ${options[i]}",Toast.LENGTH_SHORT).show()
            }
            .setPositiveButton("Accept"){ _,_ ->
                Toast.makeText(this, "You accepted the SingleChoiceDialog",Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Decline"){ _,_ ->
                Toast.makeText(this, "You declined the SingleChoiceDialog",Toast.LENGTH_SHORT).show()
            }.create()
        val btnDialog2:Button=findViewById(R.id.btnDialog2)
        btnDialog2.setOnClickListener {
          singleChoiceDialog.show()
        }


        val multichoiceDialog =AlertDialog.Builder(this)
            .setTitle("Choose One Of this Options")
            .setMultiChoiceItems(options, booleanArrayOf(false,false,false)) { _, i, isChecked ->
                if (isChecked) {
                    Toast.makeText(this, "You Checked ${options[i]}", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "You Unchecked ${options[i]}", Toast.LENGTH_SHORT).show()
                }
            }
            .setPositiveButton("Accept"){ _,_ ->
                Toast.makeText(this, "You accepted the MultiChoiceDialog",Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Decline"){ _,_ ->
                Toast.makeText(this, "You declined the MultiChoiceDialog",Toast.LENGTH_SHORT).show()
            }.create()
        val btnDialog3:Button=findViewById(R.id.btnDialog3)
        btnDialog3.setOnClickListener {
            multichoiceDialog.show()
        }



    }

}