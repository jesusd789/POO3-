public class Main {
    public static void main(String[] args) {
        System.out.println("--- Ejercicio 2 ANTES (viola ISP): una sola interfaz OperacionBancaria ---");
        OperacionBancaria cajero = new CajeroAutomatico();
        OperacionBancaria app = new BancaMovil();

        cajero.retirar(100000);
        cajero.transferir("123", 50000);      // no hace nada
        cajero.pagarFactura("F-001", 30000);  // no hace nada

        app.transferir("456", 80000);
        app.pagarFactura("F-002", 45000);
        app.retirar(20000);                   // no hace nada
        System.out.println("(Varias operaciones fallaron en silencio)");
    }
}
