package com.example.practica1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
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

        fb.setOnClickListener(){
            val selec = rg.checkedRadioButtonId
            val nameSelect = findViewById<RadioButton>(selec)
            val puntuacion = rb.rating.toInt()
            if (selec.equals(-1)) {
                Toast.makeText(applicationContext, "Debes elegir un juego.", Toast.LENGTH_LONG)
                    .show()
            }else if (selec!=-1 && puntuacion.equals(0)){
                Toast.makeText(applicationContext, "Puntua la app antes", Toast.LENGTH_LONG).show()
            }else {
                Toast.makeText(applicationContext, "" + nameSelect.text + " Puntuacion: " + puntuacion,Toast.LENGTH_LONG).show()
            }
        }
        }



    }
