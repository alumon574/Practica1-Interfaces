package com.example.practica1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val juegos = findViewById<Button>(R.id.button0)
        juegos.setOnClickListener { lanzarJuegos() }
        val jugador = findViewById<Button>(R.id.button1)
        jugador.setOnClickListener { lanzarNewPlayer() }
        val preferences = findViewById<Button>(R.id.button2)
        preferences.setOnClickListener { lanzarPreferences() }

    }

    fun lanzarNewPlayer() {
        val i = Intent(this, NewPlayer::class.java)
        startActivity(i)
    }

    fun lanzarPreferences() {
        val i = Intent(this, preferences::class.java)
        startActivity(i)
    }

    fun lanzarJuegos() {
        val i = Intent(this, games::class.java)
        startActivity(i)
    }

    fun lanzarBusqueda(){
        val i = Intent(this, Generos::class.java)
        startActivity(i)
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.action_buscar) {
            Toast.makeText(this, "Búsqueda", Toast.LENGTH_LONG).show()
            lanzarBusqueda()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}