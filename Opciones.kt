En Kotlin, las enumeraciones (enum class) proporcionan una manera eficaz 
de definir un conjunto de constantes que representan opciones específicas 
o estados. Esto es útil cuando deseas limitar las opciones válidas para un 
parámetro o una variable a un conjunto predefinido de valores

EJEMPLO:
// Definición de una enumeración para representar estados civiles
enum class EstadoCivil {
    SOLTERO,
    CASADO,
    DIVORCIADO,
    VIUDO,
    CONVIVIENTE
}

fun main() {
    // Declaración de variables utilizando la enumeración
    val persona1EstadoCivil: EstadoCivil = EstadoCivil.SOLTERO
    val persona2EstadoCivil: EstadoCivil = EstadoCivil.CASADO

    // Uso de la enumeración en un condicional
    if (persona1EstadoCivil == EstadoCivil.SOLTERO) {
        println("La persona 1 está soltera")
    }

    // Uso de un when expression para manejar diferentes opciones
    val estadoCivilPersona2 = when (persona2EstadoCivil) {
        EstadoCivil.SOLTERO -> "Soltero/a"
        EstadoCivil.CASADO -> "Casado/a"
        EstadoCivil.DIVORCIADO -> "Divorciado/a"
        EstadoCivil.VIUDO -> "Viudo/a"
        EstadoCivil.CONVIVIENTE -> "Conviviente"
    }
    println("La persona 2 está $estadoCivilPersona2")
}
