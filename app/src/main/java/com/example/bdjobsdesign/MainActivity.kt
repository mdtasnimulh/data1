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
    lateinit var textView2: TextView
    lateinit var textView3: TextView
    lateinit var textView4: TextView
    lateinit var textView5: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonChange = findViewById<Button>(R.id.requestChangedButton)
        buttonChange.setOnClickListener {
            val intent = Intent(this@MainActivity, NextDesign::class.java)
            startActivity(intent)
        }

        textView2 = findViewById(R.id.timeLeftText2)
        textView3 = findViewById(R.id.timeLeftText3)
        textView4 = findViewById(R.id.timeLeftText4)
        textView5 = findViewById(R.id.timeLeftText5)
        val text2= "Online Test for Design"
        val text3= ": "
        val text4= "5 "
        val text5= "Days"
        val spannableString2 = SpannableString(text2)
        val spannableString3 = SpannableString(text3)
        val spannableString4 = SpannableString(text4)
        val spannableString5 = SpannableString(text5)
        val styleSpan = StyleSpan(Typeface.BOLD)
        spannableString2.setSpan(styleSpan, 0, text2.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannableString3.setSpan(styleSpan, 0, text3.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannableString4.setSpan(styleSpan, 0, text4.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannableString5.setSpan(styleSpan, 0, text5.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        textView2.setText(spannableString2).toString()
        textView3.setText(spannableString3).toString()
        textView4.setText(spannableString4).toString()
        textView5.setText(spannableString5).toString()
    }
}