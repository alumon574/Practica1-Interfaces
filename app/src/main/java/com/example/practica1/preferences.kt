package com.example.practica1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup
import android.widget.RatingBar
import android.widget.SeekBar
import com.google.android.material.floatingactionbutton.FloatingActionButton

class preferences : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preferences)

        val rg = findViewById(R.id.radioGroup) as RadioGroup
        val sb = findViewById(R.id.barra) as SeekBar
        val rb = findViewById(R.id.stars) as RatingBar
        val fb = findViewById(R.id.FAB) as FloatingActionButton


        rb.onRatingBarChangeListener= RatingBar.OnRatingBarChangeListener{ratingBar, rating, fromUser ->
            sb.progress = rating.toInt()
        }

            sb.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean){
                    rb.rating = progress.toFloat()
                }
                override fun onStartTrackingTouch(seekBar: SeekBar){

                }
                override fun onStopTrackingTouch(seekBar: SeekBar){

                }
            })
        }



    }
