package com.example.guatemala

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Informacion : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informacion)

        val info:TextView = findViewById<TextView>(R.id.datosTikal)
        var bundle  = intent.extras
        val message = bundle.getString("Nombre")
        info.setText(message)






    }




}
