fun main() {
    val nombre: String? = "Juan"
    val edad: Int? = null

    println("Nombre: $nombre")
    println("Edad: $edad")

    // Ejemplo de manejo seguro de nulos utilizando el operador seguro (?.)
    val longitudNombre: Int? = nombre?.length
    println("Longitud del nombre: $longitudNombre")

    // Ejemplo de operador Elvis (?:) para proporcionar un valor por defecto en caso de nulo
    val nombreCapitalizado: String = nombre ?: "Nombre no disponible"
    println("Nombre capitalizado: $nombreCapitalizado")

    // Ejemplo de lanzamiento de excepción con !! si se sabe que el valor no será nulo
    val longitudNombreSegura: Int = nombre!!.length
    println("Longitud del nombre (seguro): $longitudNombreSegura")
}
