package com.example.begpy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_card_view.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        learnpythoncard.setOnClickListener{
            startActivity(Intent(this,CardView::class.java))
        }
        quizgamecard.setOnClickListener{
            startActivity(Intent(this,QuizQuestionsActivity::class.java))
        }




    }
}