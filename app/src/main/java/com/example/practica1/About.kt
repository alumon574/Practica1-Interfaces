package com.example.practica1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class About : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val items = ArrayList<about_item>()
        items.add(about_item(R.drawable.cola,"Maria Mata  \n2014"))
        items.add(about_item(R.drawable.flores,"Antonio Sanz  \n1890"))
        items.add(about_item(R.drawable.camino,"Carlos  \n967"))
        items.add(about_item(R.drawable.desierto, "Berta  \n945"))
        items.add(about_item(R.drawable.rio, "Hector Campos  \n879"))
        items.add(about_item(R.drawable.sol,"Ismael  \n678"))
        items.add(about_item(R.drawable.tucan,"Antonio Tucan  \n123"))
        items.add(about_item(R.drawable.trotuman,"Guillermo diaz  \n777"))

        val recycler = findViewById<RecyclerView>(R.id.recyclerAbout)

        recycler.setHasFixedSize(true)

        val adapter = AboutAdapter(items,this)
        recycler.adapter = adapter
        recycler.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        val layoutManager = LinearLayoutManager(baseContext)
        recycler.layoutManager = layoutManager

        recycler.adapter = adapter
    }
}