// Clase de prueba
public class Main {
    public static void main(String[] args) {
        System.out.println("--- DIP Ejemplo 1: Sistema de pago con dependencia de una interfaz ---");
        MetodoPago tarjeta = new TarjetaCredito();
        ProcesadorPago procesador = new ProcesadorPago(tarjeta);
        procesador.realizarPago(100.00);

        MetodoPago paypal = new PayPal();
        procesador = new ProcesadorPago(paypal);
        procesador.realizarPago(200.00);
    }
}
