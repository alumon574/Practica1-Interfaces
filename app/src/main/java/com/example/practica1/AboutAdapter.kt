package com.example.practica1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class AboutAdapter(var aboutItem: ArrayList<about_item>, val context: Context) :
    RecyclerView.Adapter<AboutAdapter.AboutViewHolder>() {

    lateinit var onClick: (View) -> Unit

    init {
        this.aboutItem = aboutItem
    }

    class AboutViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var texto: TextView
        var imagen: ImageView

        init {
            texto = itemView.findViewById(R.id.textoAbout)
            imagen = itemView.findViewById(R.id.imagenAbout)
        }

        fun bindAbout(t: about_item, onClick: (View) -> Unit) = with(itemView) {
            texto.setText(t.texto)
            setOnClickListener { (onClick(itemView)) }
        }
    }

    override fun onCreateViewHolder(ViewGroup: ViewGroup, viewType: Int): AboutViewHolder {
        val itemView =
            LayoutInflater.from(ViewGroup.context).inflate(R.layout.about_item, ViewGroup, false)
        return AboutViewHolder(itemView)
    }

    override fun onBindViewHolder(viewHolder: AboutViewHolder, position: Int) {
        val item = aboutItem[position]
        viewHolder.texto.text=item.texto
        viewHolder.imagen.setImageResource(item.imagen)
        val String = item.texto.replaceAfter("  "," ")
        viewHolder.texto.setOnClickListener{
            Toast.makeText(this.context,String,Toast.LENGTH_LONG).show()
        }
        viewHolder.imagen.setOnClickListener{
            Toast.makeText(this.context,String,Toast.LENGTH_LONG).show()
        }
    }

    override fun getItemCount(): Int {
        return aboutItem.size
    }
}