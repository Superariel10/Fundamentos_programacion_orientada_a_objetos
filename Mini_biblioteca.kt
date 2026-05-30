class Libro(
    private val id: Int,
    private val titulo: String,
    private val autor: String
) {

    private var estado = "Disponible"
    fun getId(): Int {
        return id
    }
    fun getTitulo(): String {
        return titulo
    }
    fun getAutor(): String {
        return autor
    }
    fun getEstado(): String {
        return estado
    }
    fun prestar() {
        if (estado == "Prestado") {
            println("El libro ya esta prestado.")
        } else {
            estado = "Prestado"
            println("Libro prestado correctamente.")
        }
    }
    fun devolver() {
        if (estado == "Disponible") {
            println("El libro ya esta disponible.")
        } else {
            estado = "Disponible"
            println("Libro devuelto correctamente.")
        }
    }
    fun mostrar() {
        println(
            "ID: $id | " +
            "Titulo: $titulo | " +
            "Autor: $autor | " +
            "Estado: $estado"
        )
    }
}
class Biblioteca {
    private val libros = mutableListOf<Libro>()
    fun registrarLibro(libro: Libro) {
        libros.add(libro)
    }
    fun listarDisponibles() {
        println("\nLibros disponibles:")
        for (libro in libros) {
            if (libro.getEstado() == "Disponible") {
                libro.mostrar()
            }
        }
    }
    fun buscarPorTitulo(titulo: String): Libro? {
        for (libro in libros) {
            if (libro.getTitulo().equals(titulo, ignoreCase = true)) {
                return libro
            }
        }
        return null
    }
    fun prestarLibro(titulo: String) {
        val libro = buscarPorTitulo(titulo)
        if (libro != null) {
            libro.prestar()
        } else {
            println("Libro no encontrado.")
        }
    }
    fun devolverLibro(titulo: String) {
        val libro = buscarPorTitulo(titulo)
        if (libro != null) {
            libro.devolver()
        } else {
            println("Libro no encontrado.")
        }
    }
}
fun main() {
    // Prueba del sistema
    val biblioteca = Biblioteca()
    val libro1 = Libro(
        1,
        "Cien anios de soledad",
        "Gabriel Garcia Marquez"
    )
    val libro2 = Libro(
        2,
        "Don Quijote",
        "Miguel de Cervantes"
    )
    val libro3 = Libro(
        3,
        "El Principito",
        "Antoine de Saint-Exupery"
    )
    biblioteca.registrarLibro(libro1)
    biblioteca.registrarLibro(libro2)
    biblioteca.registrarLibro(libro3)
    biblioteca.listarDisponibles()
    biblioteca.prestarLibro("Don Quijote")
    biblioteca.prestarLibro("Don Quijote") // ya prestado
    biblioteca.devolverLibro("Don Quijote")
    biblioteca.devolverLibro("Don Quijote") // ya disponible
    println("Busqueda:")
    val libro = biblioteca.buscarPorTitulo("El Principito")
    if (libro != null) {
        libro.mostrar()
    }
}