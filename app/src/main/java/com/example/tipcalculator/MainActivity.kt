package com.example.tipcalculator

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(
            R.id.calculatebtn
        ).setOnClickListener { val bill = findViewById<EditText>(R.id.billEdittext).text.toString().toDouble()
            val tipPercentage = findViewById<EditText>(R.id.tipedittxt).text.toString().toDouble() / 100
            val tip = bill * tipPercentage
            val total = tip + bill

            findViewById<TextView>(R.id.textView3).visibility = View.VISIBLE

            findViewById<TextView>(R.id.textView3).text = "Tip: ${(tip)} Total: ${(total)}" }


    }
}