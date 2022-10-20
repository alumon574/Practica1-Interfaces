package com.example.practica1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.TranslateAnimation
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class About : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)


        val btAccion = findViewById<MaterialButton>(R.id.generoAccion)
        val btAventura = findViewById<MaterialButton>(R.id.generoAventura)
        val btDeportes = findViewById<MaterialButton>(R.id.generoDeportes)
        val btDisparos = findViewById<MaterialButton>(R.id.generoDisparos)
        val btEstrategia = findViewById<MaterialButton>(R.id.generoEstrategia)
        val btLucha = findViewById<MaterialButton>(R.id.generoLucha)
        val btMusical = findViewById<MaterialButton>(R.id.generoMusical)
        val btRol = findViewById<MaterialButton>(R.id.generoRol)
        val btSimulacion = findViewById<MaterialButton>(R.id.generoSimulacion)
        val Fab = findViewById<FloatingActionButton>(R.id.bottomFAB)
        val snackbar2 = Snackbar.make( Fab,
            "El boton se mueve hacia arriba",
            Snackbar.LENGTH_LONG)
        btAccion.setOnClickListener(){
            Toast.makeText(applicationContext, btAccion.text, Toast.LENGTH_LONG).show()
        }

        btAventura.setOnClickListener(){
            Toast.makeText(applicationContext, btAventura.text, Toast.LENGTH_LONG).show()
        }

        btDeportes.setOnClickListener(){
            Toast.makeText(applicationContext, btDeportes.text, Toast.LENGTH_LONG).show()
        }

        btDisparos.setOnClickListener(){
            Toast.makeText(applicationContext, btDisparos.text, Toast.LENGTH_LONG).show()
        }

        btEstrategia.setOnClickListener(){
            Toast.makeText(applicationContext, btEstrategia.text, Toast.LENGTH_LONG).show()
        }

        btLucha.setOnClickListener(){
            Toast.makeText(applicationContext, btLucha.text, Toast.LENGTH_LONG).show()
        }

        btMusical.setOnClickListener(){
            Toast.makeText(applicationContext, btMusical.text, Toast.LENGTH_LONG).show()
        }

        btRol.setOnClickListener(){
            Toast.makeText(applicationContext, btRol.text, Toast.LENGTH_LONG).show()
        }

        btSimulacion.setOnClickListener(){
            Toast.makeText(applicationContext, btSimulacion.text, Toast.LENGTH_LONG).show()
        }
        /*Fab.setOnClickListener(){
            val anim: TranslateAnimation =TranslateAnimation(0f,0f,0f,-200f)
            anim.duration=300
            Fab.startAnimation(anim)
        }*/
        Fab.setOnClickListener(){
            snackbar2.show()
        }

    }
}