package models

class Lampada(val identificador: String) {
    //Estructura, coneguda com a propietats o atributs
    private var encendre: Boolean = false
    private var canviColor: String = "Blanc"
    private var canviIntensitat: Int = 0

    constructor(identificador: String= "Menjador",encendre: Boolean, canviColor: String, canviIntensitat: Int):this(identificador) {
        this.encendre = encendre
        this.canviColor = canviColor
        this.canviIntensitat = canviIntensitat

    }

   /* constructor(identificador: String = "Cuina",encendre: Boolean, canviColor: String, canviIntensitat: Int):this(identificador) {
        this.encendre = encendre
        this.canviColor = canviColor
        this.canviIntensitat = canviIntensitat

    } */

    fun encendre() {
        encendre = true
        //mostrarEstat()
    }

    fun apagar() {
        encendre = false
       // mostrarEstat()
    }

    fun canviarColor(nuevoColor: String) {
        canviColor = nuevoColor
        //mostrarEstat()
    }

    fun canviarIntensitat(nuevaIntensidad: Int) {
        if (nuevaIntensidad in 0..5) {
            canviIntensitat = nuevaIntensidad
           // mostrarEstat()
        } else {
            println("Error: La intensidad debe estar entre 0 y 5.")
        }
    }


    // Getters + Setters LAMPADA

    fun getEncendre(): Boolean {
        return encendre
    }

    fun setEncendre(encendre: Boolean) {
        this.encendre = encendre
    }

    fun getcanviColor(): String {
        return canviColor
    }

    fun setcanviColor(canviColor: String) {
        this.canviColor = canviColor
    }

    fun getcanviIntensitat(): Int {
        return canviIntensitat
    }

    fun setcanviIntensitat(canviIntensitat: Int) {
        this.canviIntensitat = canviIntensitat
    }


    override fun toString(): String {
        return ("Estat: ${if (encendre) "Encesa" else "Apagada"} --> Color: $canviColor --> Intensitat: $canviIntensitat")
    }
}
