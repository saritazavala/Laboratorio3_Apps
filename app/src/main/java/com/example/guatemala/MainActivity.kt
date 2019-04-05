package com.example.guatemala

import android.annotation.SuppressLint
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

    //Funcion para mostrar, habilitary deshabilitar los texts

    fun mostrarTexto(view: View) {
        //Se llaman y referencian a las partes de mi interfaz
        //Botones, textviews
        val boton: ImageButton = findViewById<ImageButton>(R.id.BotonEstrella)
        val ingresado: EditText = findViewById<EditText>(R.id.NombreIngresado)
        val resultado: TextView = findViewById<TextView>(R.id.Resultado)
        val nombre: TextView = findViewById<TextView>(R.id.EtiquetaNombre)
        //Contador para la deshabilitacion de las partes indicadas
        var contador = 1 //contador iniciado en 1 porque los clicks empiezan en 0
        boton.setOnClickListener {
            //La idea es que cada vez que se toque el boton se va a ir sumando 1 al cotador
            //Si es un numero par o sea, si el residuo de su division con 2 = 0, entonces estará
            //habilitado, de lo contrario se va a deshabilitar
            contador = contador + 1
            if (contador % 2 != 0) {

                //ingresado.setEnabled(true);
                //nombre.isEnabled= true
                nombre.visibility = View.VISIBLE
                ingresado.visibility = View.VISIBLE
                resultado.setText(ingresado.text.toString())
            } else {
                nombre.visibility = View.INVISIBLE
                ingresado.visibility = View.INVISIBLE

                //ingresado.setEnabled(false);
                //nombre.isEnabled= false
                resultado.setText(ingresado.text.toString())
            }

        }
    }

    fun abrirBotonTikal(view: View) {

        val intento: Intent = Intent(this, Informacion::class.java)
        intento.putExtra("Tikal", "Tikal es uno de los mayores yacimientos arqueológicos y centros urbanos de la civilización maya precolombina. \n Está situado en el municipio de Flores, en el departamento de Petén, en el territorio actual de la República de Guatemala \n y forma parte del Parque nacional Tikal, que fue declarado Patrimonio de la Humanidad, por Unesco, en 1979")
        startActivity(intento)


    }


    fun abrirSemuc(view: View) {
        val intento: Intent = Intent(this, Informacion::class.java)
        intento.putExtra("Semuc", "Descripcion")
        startActivity(intento)

    }

    fun abrirAntigua(view: View){
        val intento: Intent = Intent(this, Informacion::class.java)
        intento.putExtra("Antigua ", "Descripcion")
        startActivity(intento)
    }

}





