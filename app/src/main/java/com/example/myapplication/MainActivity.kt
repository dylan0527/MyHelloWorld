package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

//: is extend
class MainActivity : AppCompatActivity() {
    //onCreate = main()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Create the UI
        //R = resources
        setContentView(R.layout.activity_main)
        //TODO continue your work here

        //val = value(it will never change) , var = variable (it will change)
        val buttonHelloWorld : Button = findViewById(R.id.buttonHelloWorld)
        buttonHelloWorld.setOnClickListener { showMessage() }
        val buttonReset : Button = findViewById(R.id.buttonReset)
        buttonReset.setOnClickListener { showHello() }
    }

    private fun showHello(){
        val textViewMessage : TextView = findViewById(R.id.textViewMessage)
        textViewMessage.setText(getString(R.string.helloWorld))
    }

    private fun showMessage() {
        val textViewMessage : TextView = findViewById(R.id.textViewMessage)
        textViewMessage.setText("Hello lol")

    }
}
