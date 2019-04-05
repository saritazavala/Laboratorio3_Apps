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

    //https://medium.com/@jencisov/androids-data-binding-with-kotlin-df94a24ffc0f
    fun abrirBotonTikal(view: View) {

        val intento: Intent = Intent(this, Informacion::class.java)
        intento.putExtra("Tikal", " Tikal (o Tik'al, de acuerdo con la ortografía maya moderna) es uno de los mayores yacimientos arqueológicos y centros urbanos de la civilización maya precolombina. Está situado en el municipio de Flores, en el departamento de Petén, en el territorio actual de la República de Guatemala y forma parte del Parque nacional Tikal, que fue declarado Patrimonio de la Humanidad, por Unesco, en 1979.1\u200B Según los glifos encontrados en el yacimiento, su nombre maya habría sido Yax Mutul.2\u200B\n" +
                "\n" +
                "Tikal fue la capital de un estado beligerante, que se convirtió en uno de los reinos más poderosos de los antiguos mayas.3\u200B4\u200B Aunque la arquitectura monumental del sitio se remonta hasta el siglo iv a. C., Tikal alcanzó su apogeo durante el Período Clásico, entre el 200 y el 900 d. C. Durante este tiempo, la ciudad dominó gran parte de la región maya, en el ámbito político, económico y militar y mantenía vínculos con otras regiones, a lo largo de Mesoamérica, incluso con la gran metrópoli de Teotihuacan, en el lejano Valle de México.5\u200B\n" +
                "\n" +
                "Después del Clásico Tardío, no se construyeron monumentos mayores.\n" +
                "\n" +
                "Con una larga lista de gobernantes dinásticos, el descubrimiento de muchas de sus respectivas tumbas y el estudio de sus monumentos, templos y palacios, Tikal es probablemente la mejor comprendida de las grandes ciudades mayas de las tierras bajas de Mesoamérica")
        intento.putExtra( "frase","El gran Jaguar se encuentra dentro de la selva tropical de Petén")
        intento.putExtra("titulo", "Tikal,Petén")

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





