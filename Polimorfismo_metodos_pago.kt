interface MetodoPago {
    fun procesarPago(monto: Double): String
}
class PagoEfectivo : MetodoPago {
    override fun procesarPago(monto: Double): String {
        return "Pago en efectivo realizado por $$monto"
    }
}
class PagoTarjeta : MetodoPago {
    override fun procesarPago(monto: Double): String {
        return "Pago con tarjeta aprobado por $$monto"
    }
}
class PagoTransferencia : MetodoPago {
    override fun procesarPago(monto: Double): String {
        return "Transferencia bancaria realizada por $$monto"
    }
}
fun procesarPagos(listaPagos: List<MetodoPago>) {
    for (pago in listaPagos) {
        println(pago.procesarPago(150.0))
    }
}
fun main() {
    val pagos = listOf(
        PagoEfectivo(),
        PagoTarjeta(),
        PagoTransferencia()
    )
    println("Procesando pagos:")
    procesarPagos(pagos)
}