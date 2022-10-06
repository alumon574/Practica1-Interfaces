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

        var jugador = findViewById(R.id.button1) as Button
        jugador.setOnClickListener { (lanzarNewPlayer()) }
        jugador = findViewById(R.id.button2) as Button
        jugador.setOnClickListener { lanzarPreferences() }
    }

    fun lanzarNewPlayer() {
        val i = Intent(this, NewPlayer::class.java)
        startActivity(i)
    }

    fun lanzarPreferences() {
        val i = Intent(this, preferences::class.java)
        startActivity(i)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id =item.itemId
        if (id == R.id.action_buscar){
            Toast.makeText(this,"Búsqueda",Toast.LENGTH_LONG).show()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}