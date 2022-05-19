package com.example.begpy

import android.content.Intent
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_lesson1.*
import kotlinx.android.synthetic.main.activity_lesson4.*
import kotlinx.android.synthetic.main.activity_lesson4.nextlesson

class lesson1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson1)
        AppCompatDelegate.setDefaultNightMode(
            AppCompatDelegate.MODE_NIGHT_NO);
        supportActionBar?.setBackgroundDrawable(ColorDrawable(ContextCompat.getColor(this,R.color.steel_blue)))

        nextlesson.setOnClickListener{
            startActivity(Intent(this,lesson2::class.java))

            homebutton.setOnClickListener{
                startActivity(Intent(this,MainActivity::class.java))

        }
    }
   }
}