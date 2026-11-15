// Clase TarjetaCredito que implementa MetodoPago
public class TarjetaCredito implements MetodoPago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con tarjeta de crédito: $" + monto);
    }
}
