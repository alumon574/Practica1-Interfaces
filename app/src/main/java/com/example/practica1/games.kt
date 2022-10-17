package com.example.practica1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton

class games : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_games)

        val fButton = findViewById<FloatingActionButton>(R.id.action_button)
        val cBox1 = findViewById<CheckBox>(R.id.check1)
        val cBox2 = findViewById<CheckBox>(R.id.check2)
        val cBox3 = findViewById<CheckBox>(R.id.check3)
        val cBox4 = findViewById<CheckBox>(R.id.check4)
        val cBox5 = findViewById<CheckBox>(R.id.check5)
        val cBox6 = findViewById<CheckBox>(R.id.check6)
        val cBox7 = findViewById<CheckBox>(R.id.check7)
        var name = "Has elegido: "

        fButton.setOnClickListener(){
            if (cBox1.isChecked) name = name + cBox1.text + ", "
            if (cBox2.isChecked) name = name + cBox2.text + ", "
            if (cBox3.isChecked) name = name + cBox3.text + ", "
            if (cBox4.isChecked) name = name + cBox4.text + ", "
            if (cBox5.isChecked) name = name + cBox5.text + ", "
            if (cBox6.isChecked) name = name + cBox6.text + ", "
            if (cBox7.isChecked) name = name + cBox7.text + ", "

            if (name.equals("Has elegido: ")){
                Toast.makeText(applicationContext, "Elige un juego", Toast.LENGTH_LONG).show()
            }
            else{
                name = name.dropLast(2)
                name = name.reversed()
                name = name.replaceFirst("," , "y ")
                name = name.reversed()
                Toast.makeText(applicationContext, name,Toast.LENGTH_LONG).show()
            }
            name = "Has elegido: "
        }
    }
}