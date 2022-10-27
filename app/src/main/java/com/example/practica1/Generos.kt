package com.example.practica1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class Generos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generos)

        val items = ArrayList<item_generos>()
        items.add(item_generos(R.string.Accion))
        items.add(item_generos(R.string.Aventura))
        items.add(item_generos(R.string.Deportes))
        items.add(item_generos(R.string.Disparos))
        items.add(item_generos(R.string.Estrategia))
        items.add(item_generos(R.string.Lucha))
        items.add(item_generos(R.string.Musical))
        items.add(item_generos(R.string.Simulacion))
        items.add(item_generos(R.string.Rol))

        val recView = findViewById<RecyclerView>(R.id.recyclerView)


        recView.setHasFixedSize(true)

        val adaptador = genreListAdapter(items)
        recView.adapter = adaptador
        recView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        val layoutManager = LinearLayoutManager(baseContext)
        recView.layoutManager = layoutManager

        recView.adapter = adaptador


        /*val btAccion = findViewById<MaterialButton>(R.id.generoAccion)
        val btAventura = findViewById<MaterialButton>(R.id.generoAventura)
        val btDeportes = findViewById<MaterialButton>(R.id.generoDeportes)
        val btDisparos = findViewById<MaterialButton>(R.id.generoDisparos)
        val btEstrategia = findViewById<MaterialButton>(R.id.generoEstrategia)
        val btLucha = findViewById<MaterialButton>(R.id.generoLucha)
        val btMusical = findViewById<MaterialButton>(R.id.generoMusical)
        val btRol = findViewById<MaterialButton>(R.id.generoRol)
        val btSimulacion = findViewById<MaterialButton>(R.id.generoSimulacion)


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
        }*/
        val Fab = findViewById<FloatingActionButton>(R.id.bottomFAB)
        val snackbar2 = Snackbar.make( Fab,
            "El boton se mueve hacia arriba",
            Snackbar.LENGTH_LONG)
        Fab.setOnClickListener(){
            snackbar2.show()
        }

    }
}


