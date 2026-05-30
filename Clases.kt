class Libro(
    private val titulo: String,
    private val autor: String,
    private val anioPublicacion: Int,
    private val numeroPaginas: Int
) {
    fun mostrarInformacion() {
        println("Titulo: $titulo")
        println("Autor: $autor")
        println("Anio de publicacion: $anioPublicacion")
        println("Numero de paginas: $numeroPaginas")
    }
    fun clasificarLibro() {
        if (anioPublicacion < 2000) {
            println("El libro es antiguo.")
        } else {
            println("El libro es reciente.")
        }
    }
}
fun main() {
    val libro1 = Libro(
        "Cien anos de soledad",
        "Gabriel García Márquez",
        1967,
        496
    )
    libro1.mostrarInformacion()
    libro1.clasificarLibro()
}