package com.example.bdjobsdesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonChange = findViewById<Button>(R.id.requestChangedButton)
        buttonChange.setOnClickListener {
            val intent = Intent(this@MainActivity, NextDesign::class.java)
            startActivity(intent)
        }
    }
}