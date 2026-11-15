public class Main {
    public static void main(String[] args) {
        System.out.println("--- Ejercicio 2 DESPUÉS (aplica ISP): Transferible, Retirable, PagoFacturas ---");
        Retirable cajero = new CajeroAutomatico();
        BancaMovil app = new BancaMovil();
        CuentaCorriente cuenta = new CuentaCorriente();

        cajero.retirar(100000);
        app.transferir("456", 80000);
        app.pagarFactura("F-002", 45000);
        cuenta.transferir("789", 10000);
        cuenta.retirar(5000);
        cuenta.pagarFactura("F-003", 12000);
    }
}
