package com.example.twoactivities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    private lateinit var myToolbar: Toolbar
    private lateinit var button: Button
    private lateinit var myEditText: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myToolbar = findViewById(R.id.toolBar)
        setSupportActionBar(myToolbar)

        myEditText = findViewById(R.id.text)
        button = findViewById(R.id.button)

        button.setOnClickListener {
            val sendText = myEditText.text.toString()
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("sendText",sendText)
            startActivity(intent)
        }
    }
}