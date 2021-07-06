package controllers

import models.Usuario
import java.util.*
import java.util.*
import javax.print.DocFlavor
import javax.xml.stream.events.Characters
import kotlin.collections.ArrayList

fun  generarUsuario(nombre:String,apellido:String):String{
    var usuarioCreado:String = ""
    val subCadena = (("$nombre $apellido").uppercase(Locale.getDefault())).split(" ")

    fun obtenerUsuario():String{
        var usuarioGenerado:String = ""
        when(subCadena.size){
            4 -> {
                var subcaracteres=(subCadena[2].toCharArray())
                usuarioGenerado += subcaracteres[0]
                usuarioGenerado += subcaracteres[1]
                subcaracteres=(subCadena[3].toCharArray())
                usuarioGenerado += subcaracteres[0]
                subcaracteres=(subCadena[0].toCharArray())
                usuarioGenerado += subcaracteres[0]
                usuarioGenerado += subcaracteres[1]
                subcaracteres=(subCadena[1].toCharArray())
                usuarioGenerado += subcaracteres[0]
            }
            3 -> {
                var subcaracteres=(subCadena[2].toCharArray())
                usuarioGenerado += subcaracteres[0]
                usuarioGenerado += subcaracteres[1]
                subcaracteres=(subCadena[0].toCharArray())
                usuarioGenerado += subcaracteres[0]
                usuarioGenerado += subcaracteres[1]
                subcaracteres=(subCadena[1].toCharArray())
                usuarioGenerado += subcaracteres[0]
            }
            2 -> {
                var subcaracteres = (subCadena[1].toCharArray())
                if (subCadena[1] != ""){
                    var subcaracteres = (subCadena[1].toCharArray())
                    //subcaracteres=(subCadena[0].toCharArray())
                    usuarioGenerado += subcaracteres[0]
                    usuarioGenerado += subcaracteres[1]
                }
                subcaracteres=(subCadena[0].toCharArray())
                usuarioGenerado += subcaracteres[0]
            }
            else->{
                usuarioGenerado += subCadena
            }
        }
        return usuarioGenerado
    }
    usuarioCreado = obtenerUsuario()
    return usuarioCreado+2021
}

fun existeUsuario(usuariosMap:MutableMap<Int, Usuario>, user:String):Boolean{
    var existe=false
    for ((key, value) in usuariosMap) {
        /*println("IdUsuario: $key")
        println("Usuario: ${value.getUsuario()}")*/

        if (value.getUsuario().equals(user)) {
            existe=true
        }
    }
    return existe
}

fun totalUsuarios(usuariosMap:MutableMap<Int, Usuario>):Int{
    return usuariosMap.size
}

