public class Main {
    public static void main(String[] args) {
        System.out.println("--- DIP Violación 1: ProcesadorPago depende de TarjetaCredito ---");
        ProcesadorPago procesador = new ProcesadorPago(new TarjetaCredito());
        procesador.realizarPago(100.00);

        System.out.println("Para aceptar PayPal habría que MODIFICAR ProcesadorPago:");
        System.out.println("su constructor solo acepta TarjetaCredito (acoplamiento fuerte).");
    }
}
