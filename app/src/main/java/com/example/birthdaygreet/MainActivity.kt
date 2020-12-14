package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById<Button>(R.id.button3)
        val text: EditText = findViewById<EditText>(R.id.editText)

        button.setOnClickListener()
        {
            val intent = Intent(this,MainActivity2::class.java)
            val name2  = text.editableText.toString()
            intent.putExtra(MainActivity2.NAME_EXTRA,name2)


            startActivity(intent)

        }

    }





}