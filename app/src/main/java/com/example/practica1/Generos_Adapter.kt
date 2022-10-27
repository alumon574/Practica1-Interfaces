package com.example.practica1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class genreListAdapter(var items: ArrayList<item_generos>) :
    RecyclerView.Adapter<genreListAdapter.gameListViewHolder>() {
    lateinit var onClick: (View) -> Unit

    init {
        this.items = items
    }

    class gameListViewHolder(itemView: TextView) : RecyclerView.ViewHolder(itemView) {
        private var texto: TextView

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
        return gameListViewHolder(itemView as TextView)
    }

    override fun onBindViewHolder(viewHolder: gameListViewHolder, position: Int) {
        val item = items.get(position)
        viewHolder.bindLista(item, onClick)
    }

    override fun getItemCount(): Int {
        return items.size
    }
}
