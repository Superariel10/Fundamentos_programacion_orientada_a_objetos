open class Vehiculo(
    var marca: String,
    var modelo: String,
    var anio: Int
) {
    open fun mostrarDatos() {
        println("Marca: $marca")
        println("Modelo: $modelo")
        println("Año: $anio")
    }
}
class Auto(
    marca: String,
    modelo: String,
    anio: Int,
    var puertas: Int
) : Vehiculo(marca, modelo, anio) {
    override fun mostrarDatos() {
        println("=== Auto ===")
        println("Marca: $marca")
        println("Modelo: $modelo")
        println("Año: $anio")
        println("Número de puertas: $puertas")
    }
}
class Motocicleta(
    marca: String,
    modelo: String,
    anio: Int,
    var cilindrada: Int
) : Vehiculo(marca, modelo, anio) {
    override fun mostrarDatos() {
        println("=== Motocicleta ===")
        println("Marca: $marca")
        println("Modelo: $modelo")
        println("Año: $anio")
        println("Cilindrada: $cilindrada")
    }
}
fun main() {
    // Crear objetos
    val auto1 = Auto("Toyota", "Corolla", 2022, 4)
    val moto1 = Motocicleta("Yamaha", "MT-07", 2023, 689)
    // Mostrar datos
    auto1.mostrarDatos()
    println()
    moto1.mostrarDatos()
}