#### Lampada

![Lampada](https://github.com/mcalex468/Lampada/blob/master/lampada.jpg)

# Classe Lampada

La classe `Lampada` representa una llàntia amb funcionalitats d'encendre, apagar, canviar color i intensitat.

## Propietats

- `encendre`: Indica si la llàntia està encesa o apagada.
- `canviColor`: Representa el color actual de la llàntia.
- `canviIntensitat`: Emmagatzema la intensitat actual de la llàntia.
- `identificador`: Etiqueta identificativa de la llàntia.
- `colorsValids`: Llista de colors vàlids.

## Mètodes

- `identificador(identificadorActual: String)`: Estableix l'identificador de la llàntia.
- `encendre()`: Encén la llàntia i mostra l'estat actual.
- `apagar()`: Apaga la llàntia i mostra l'estat actual.
- `canviarColor()`: Permet a l'usuari canviar el color de la llàntia.
- `canviarIntensitat()`: Permet a l'usuari canviar la intensitat de la llàntia.
- `estatActual()`: Mostra l'estat actual de la llàntia.


## Main (Exemple)

```kotlin
// Ejemplo de uso en un programa Kotlin
import models.Lampada

fun main() {
    var lampadaMenjador: Lampada = Lampada()
    lampadaMenjador.identificador("Làmpada Menjador")
    lampadaMenjador.encendre()
    lampadaMenjador.canviarColor()
    lampadaMenjador.canviarIntensitat()

    var lampadaCuina: Lampada = Lampada()
    lampadaCuina.identificador("Làmpada Cuina")
    lampadaCuina.encendre()
    lampadaCuina.canviarColor()
    lampadaCuina.canviarIntensitat()
    lampadaCuina.apagar()
    lampadaCuina.canviarColor()
    lampadaCuina.encendre()
    lampadaCuina.canviarColor()
    lampadaCuina.canviarIntensitat()
}



#### Autor
Alex Martin Cobo


