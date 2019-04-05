package com.example.guatemala

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun mostrarTexto(view:View){
        val boton:ImageButton = findViewById<ImageButton>(R.id.BotonEstrella)
        val ingresado: EditText = findViewById<EditText>(R.id.NombreIngresado)
        val resultado:TextView = findViewById<TextView>(R.id.Resultado)
        val nombre:TextView = findViewById<TextView>(R.id.EtiquetaNombre)
        var contador = 1
        boton.setOnClickListener {
            contador = contador + 1

            if (contador%2 !=0){

                ingresado.setEnabled(true);
                nombre.isEnabled= true
                resultado.setText(ingresado.text.toString())


        }
            else {

                ingresado.setEnabled(false);
                nombre.isEnabled= false
                resultado.setText(ingresado.text.toString())

            }

        }
    }






}
