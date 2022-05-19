package com.example.begpy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_lesson4.*

class lesson2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson2)
        backlesson.setOnClickListener{
            startActivity(Intent(this,lesson1::class.java))
        }
        nextlesson.setOnClickListener{
            startActivity(Intent(this,lesson3::class.java))
        }


    }
}