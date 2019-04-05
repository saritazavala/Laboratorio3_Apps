package com.example.guatemala

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun mostrarTexto(view:View){
        val boton:ImageButton = findViewById<ImageButton>(R.id.BotonEstrella)
        val ingresdo:TextView = findViewById<TextView>(R.id.NombreIngresado)
        boton.setOnClickListener {
            // your code to perform when the user clicks on the button
            Toast.makeText(this, "No puede disminuir abajo de cero", Toast.LENGTH_LONG).show()
        }
    }






}
