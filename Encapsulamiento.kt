class ProductoInventario(
    val codigo: String,
    val nombre: String,
    private var precio: Double,
    private var stock: Int
) {
    init {
        if (precio < 0) precio = 0.0
        if (stock < 0) stock = 0
    }
    fun consultar() {
        println("Codigo: $codigo")
        println("Nombre: $nombre")
        println("Precio: $precio")
        println("Stock: $stock")
    }
    fun aumentarStock(cantidad: Int) {
        if (cantidad > 0) {
            stock += cantidad
            println("Stock actualizado: $stock")
        }
    }
    fun disminuirStock(cantidad: Int) {
        if (cantidad > 0) {
            if (stock - cantidad >= 0) {
                stock -= cantidad
                println("Stock actualizado: $stock")
            } else {
                println("Error: el stock no puede quedar negativo")
            }
        }
    }
    fun cambiarPrecio(nuevoPrecio: Double) {
        if (nuevoPrecio >= 0) {
            precio = nuevoPrecio
            println("Nuevo precio: $precio")
        } else {
            println("Error: el precio no puede ser negativo")
        }
    }
}
fun main() {
    // Crear un producto
    val producto1 = ProductoInventario(
        "P001",
        "Teclado",
        25.50,
        10
    )
    // Consultar datos
    producto1.consultar()
    // Aumentar stock
    producto1.aumentarStock(5)
    // Disminuir stock
    producto1.disminuirStock(8)
    // Cambiar precio
    producto1.cambiarPrecio(30.0)
    // Intentos inválidos
    producto1.disminuirStock(20)
    producto1.cambiarPrecio(-10.0)
}