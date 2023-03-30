package com.example.karljustinapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_latest_movies.*
import kotlinx.android.synthetic.main.activity_main.*

class LatestMovies : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latest_movies)

        button3.setOnClickListener{
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}