#### Lampada

![Lampada](https://github.com/mcalex468/Lampada/blob/master/lampada.jpg)

# Clase Lampada

La clase `Lampada` representa una lámpara con funcionalidades de encendido, apagado, cambio de color e intensidad. 

## Propiedades

- `encendre`: Indica si la lámpara está encendida o apagada.
- `canviColor`: Representa el color actual de la lámpara.
- `canviIntensitat`: Almacena la intensidad actual de la lámpara.
- `identificador`: Etiqueta identificativa de la lámpara.
- `colorsValids`: Lista de colores válidos.

## Métodos

- `identificador(identificadorActual: String)`: Establece el identificador de la lámpara.
- `encendre()`: Enciende la lámpara y muestra el estado actual.
- `apagar()`: Apaga la lámpara y muestra el estado actual.
- `canviarColor()`: Permite al usuario cambiar el color de la lámpara.
- `canviarIntensitat()`: Permite al usuario cambiar la intensidad de la lámpara.
- `estatActual()`: Muestra el estado actual de la lámpara.

## Uso en Ejemplo

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


### Autor

Alex Martin Cobo
