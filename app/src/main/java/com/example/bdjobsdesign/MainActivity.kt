package com.example.bdjobsdesign

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonChange = findViewById<Button>(R.id.requestChangedButton)
        buttonChange.setOnClickListener {
            val intent = Intent(this@MainActivity, NextDesign::class.java)
            startActivity(intent)
        }

        textView = findViewById(R.id.timeLeftText)
        val text: String = "Time Left for Online Test for Design: 5 Days"
        val spannableString = SpannableString(text)
        val styleSpan = StyleSpan(Typeface.BOLD)
        spannableString.setSpan(styleSpan, 14, 44, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        textView.setText(spannableString).toString()
    }
}