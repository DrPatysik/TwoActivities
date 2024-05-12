package com.example.twoactivities

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class SecondActivity : AppCompatActivity() {
    private lateinit var myToolbar: Toolbar
    private lateinit var myTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        myToolbar = findViewById(R.id.toolBar)
        setSupportActionBar(myToolbar)

        myTextView = findViewById(R.id.getText1)
        val msgFromEditText = intent.getStringExtra("sendText")
        myTextView.text = msgFromEditText
    }
}