package com.example.practica1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.button.MaterialButton

class genreListAdapter(var items: ArrayList<item_generos>, val context:Context) :
    RecyclerView.Adapter<genreListAdapter.gameListViewHolder>() {
    lateinit var onClick: (View) -> Unit

    init {
        this.items = items
    }

    class gameListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var texto: MaterialButton

        init {
            texto = itemView.findViewById(R.id.boton)
        }

        fun bindLista(l: item_generos, onClick: (View) -> Unit) = with(itemView) {
            texto.setText(l.texto)
            setOnClickListener { onClick(itemView) }
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): gameListViewHolder {
        val itemView = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.activity_item_generos, viewGroup, false)
        return gameListViewHolder(itemView)
    }

    override fun onBindViewHolder(viewHolder: gameListViewHolder, position: Int) {
        val item = items[position]
        viewHolder.texto.text = item.texto
        viewHolder.texto.setOnClickListener{
            Toast.makeText(this.context,item.texto,Toast.LENGTH_LONG).show()
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
}
