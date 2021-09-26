package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var num1 : EditText
    lateinit var num2 : EditText
    lateinit var result : TextView
    lateinit var button : Button
    lateinit var button2: Button
    lateinit var button3: Button
    lateinit var button4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        num1=findViewById(R.id.num1)
        num2 = findViewById(R.id.num2)
        result = findViewById(R.id.result)
        button = findViewById(R.id.button)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        button4 = findViewById(R.id.button4)

    }

    fun sum(view: View) {
        val a = num1.text.toString().toInt()
        val b = num2.text.toString().toInt()
        val r = a + b
        result.text = r.toString()
    }
    fun sub2(view: View) {
        val a = num1.text.toString().toInt()
        val b = num2.text.toString().toInt()
        val r = a - b
        result.text = r.toString()
    }
    fun mul3(view: View) {
        val a = num1.text.toString().toInt()
        val b = num2.text.toString().toInt()
        val r = a * b
        result.text = r.toString()
    }
    fun div4(view: View) {
        val a = num1.text.toString().toInt()
        val b = num2.text.toString().toInt()
        val r = a / b
        result.text = r.toString()
    }
}