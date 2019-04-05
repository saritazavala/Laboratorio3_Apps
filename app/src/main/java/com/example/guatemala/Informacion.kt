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


        val datos: TextView = findViewById<TextView>(R.id.info)
        val frase: TextView = findViewById<TextView>(R.id.frase)
        val tit:TextView = findViewById<TextView>(R.id.titulo)
        val bundle:Bundle = intent.extras

        val texto = bundle.getString("Tikal")
        val texto2 = bundle.getString("frase")
        val texto3 = bundle.getString("titulo")

        datos.setText(texto)
        frase.setText(texto2)
        tit.setText(texto3)

        val textoS1 = bundle.getString("Semuc")
        val textoS2 = bundle.getString("fraseS")
        val textoS3 = bundle.getString("TituloS")

        datos.setText(textoS1)
        frase.setText(textoS2)
        tit.setText(textoS3)









    }




}
