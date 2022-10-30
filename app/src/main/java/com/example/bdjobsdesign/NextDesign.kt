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

    lateinit var textView2: TextView
    lateinit var textView3: TextView

    lateinit var textViewHour: TextView
    lateinit var textViewColon1: TextView
    lateinit var textViewMinutes: TextView
    lateinit var textViewColon2: TextView
    lateinit var textViewSeconds: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next_design)

        textView2 = findViewById(R.id.timeLeftText2)
        textView3 = findViewById(R.id.timeLeftText3)

        textViewHour = findViewById(R.id.timeLeftTextHour)
        textViewColon1 = findViewById(R.id.timeLeftTextColon1)
        textViewMinutes = findViewById(R.id.timeLeftTextMinutes)
        textViewColon2 = findViewById(R.id.timeLeftTextColon2)
        textViewSeconds = findViewById(R.id.timeLeftTextSeconds)

        //Setting value for TextViews
        val text2= "Online Test for Design"
        val text3= ": "
        val textViewHourV= "00"
        val textViewColon1V= ":"
        val textViewMinutesV= "03"
        val textViewColon2V= ":"
        val textViewSecondsV= "17"

        // Defining Span Text
        val spannableString2 = SpannableString(text2)
        val spannableString3 = SpannableString(text3)
        val spannableStringHour = SpannableString(textViewHourV)
        val spannableStringColon1 = SpannableString(textViewColon1V)
        val spannableStringMinutes = SpannableString(textViewMinutesV)
        val spannableStringColon2 = SpannableString(textViewColon2V)
        val spannableStringSeconds = SpannableString(textViewSecondsV)

        //Setting Bold Style
        val styleSpan = StyleSpan(Typeface.BOLD)
        //Setting Color Red
        val colorSpan = ForegroundColorSpan(Color.RED)

        //Setting Bold text
        spannableString2.setSpan(styleSpan, 0, text2.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannableString3.setSpan(styleSpan, 0, text3.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannableStringHour.setSpan(styleSpan, 0, textViewHourV.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannableStringColon1.setSpan(styleSpan, 0, textViewColon1V.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannableStringMinutes.setSpan(styleSpan, 0, textViewMinutesV.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannableStringColon2.setSpan(styleSpan, 0, textViewColon2V.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannableStringSeconds.setSpan(styleSpan, 0, textViewSecondsV.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        //Setting Color Text
        spannableStringHour.setSpan(colorSpan, 0, textViewHourV.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannableStringColon1.setSpan(colorSpan, 0, textViewColon1V.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannableStringMinutes.setSpan(colorSpan, 0, textViewMinutesV.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannableStringColon2.setSpan(colorSpan, 0, textViewColon2V.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        spannableStringSeconds.setSpan(colorSpan, 0, textViewSecondsV.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        // Style Bold
        textView2.setText(spannableString2).toString()
        textView3.setText(spannableString3).toString()

        // Color Red
        textViewHour.setText(spannableStringHour).toString()
        textViewColon1.setText(spannableStringColon1).toString()
        textViewMinutes.setText(spannableStringMinutes).toString()
        textViewColon2.setText(spannableStringColon2).toString()
        textViewSeconds.setText(spannableStringSeconds).toString()
    }
}