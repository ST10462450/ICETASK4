package com.example.arraytaskice4

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var displayText : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        displayText = findViewById(R.id.displayText)
        val BallPlayers = arrayOf<String>("Edwards", "Curry", "Lebron", "Durant", "Westbrook", "Harden", "Kawhi", "Jokic")


        // display only the first player in the list
        displayText.text = BallPlayers[0]



        }
    }


