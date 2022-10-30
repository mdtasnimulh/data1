package com.example.bdjobsdesign

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan
import android.widget.TextView

class NextDesign : AppCompatActivity() {
    lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next_design)

        textView = findViewById(R.id.timeLeftText)
        val text: String = "Time Left for Online Test for Design: 00:03:17"
        val spannableString = SpannableString(text)
        val colorSpan = ForegroundColorSpan(Color.RED)
        val styleSpan = StyleSpan(Typeface.BOLD)
        spannableString.setSpan(colorSpan,38, 46, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannableString.setSpan(styleSpan, 14, 46, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        textView.setText(spannableString).toString()
    }
}