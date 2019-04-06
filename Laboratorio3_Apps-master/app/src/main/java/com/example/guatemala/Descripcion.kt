package com.example.guatemala

import android.os.Bundle
import java.io.Serializable
/*Sara Zavala 18893
Programación de Apps mobiles
Laboratorio 3: Guatemala
Vuernes 05 de Abril 2019 */

//data class creada como en los ejemplos en clase

data class Descripcion(var nombre:String,var desc:String, var frase:String) : Serializable {

}
