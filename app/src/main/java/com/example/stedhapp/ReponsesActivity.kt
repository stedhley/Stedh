package com.example.stedhapp.

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ReponsesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_reponses)

        val txtReponses = findViewById<TextView>(R.id.txtReponses)
        txtReponses.text="Je suis Kewing"



    }
}