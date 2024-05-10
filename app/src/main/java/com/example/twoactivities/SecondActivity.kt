package com.example.twoactivities

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    private lateinit var myToolbar: Toolbar
    private lateinit var text1: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        myToolbar = findViewById(R.id.toolBar)
        setSupportActionBar(myToolbar)

        text1 = findViewById(R.id.getText1)
        val getText = intent.getStringExtra("sendText")
        text1.text = getText
        //на 2й активити не появляется текст

    }
}