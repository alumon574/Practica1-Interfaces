package com.example.practica1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.*

class NewPlayer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_player)
        val telefonos = arrayOf("Telefono1", "Telefono2", "Telefono3", "Telefono5", "Telefono6")

        val adaptador = ArrayAdapter(this, android.R.layout.simple_spinner_item, telefonos)

        val phoneField = findViewById(R.id.PhoneField) as TextView

        val list_telfs = findViewById(R.id.spinner) as Spinner
        list_telfs.adapter = adaptador
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        list_telfs.setOnItemSelectedListener(object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                var selectedPhone = list_telfs.selectedItem
                phoneField.text = selectedPhone as CharSequence?
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })
    }
}