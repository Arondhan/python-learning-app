package com.example.begpy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_lesson4.*

class lesson6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson6)

        backlesson.setOnClickListener{
            startActivity(Intent(this,lesson5::class.java))
        }
        nextlesson.setOnClickListener{
            startActivity(Intent(this,lesson7::class.java))
        }
    }
}