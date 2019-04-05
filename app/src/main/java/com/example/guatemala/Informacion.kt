package com.example.guatemala

import android.content.pm.ActivityInfo
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.*

class Informacion : AppCompatActivity() {


//Tomado de https://medium.com/@ashdavies/leveraging-android-data-binding-with-kotlin-adfd7b73aeea
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informacion)

        val datos: TextView = findViewById<TextView>(R.id.datosTikal)

        val bundle:Bundle = intent.extras
        val texto = bundle.getString("Tikal")
        datos.setText(texto)

    }




}
