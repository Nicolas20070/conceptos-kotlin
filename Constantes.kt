En Kotlin, las constantes se definen utilizando la palabra clave val. 
Una constante es un valor que no puede ser cambiado una vez que se le 
asigna un valor inicial. Esto proporciona inmutabilidad, lo cual es útil 
cuando queremos asegurarnos de que un valor no cambie durante la ejecución 
del programa.

EJEMPLO:

fun main() {
    val PI = 3.14159
    val SALUDO = "Hola, mundo!"

    println("El valor de PI es: $PI")
    println(SALUDO)
}
