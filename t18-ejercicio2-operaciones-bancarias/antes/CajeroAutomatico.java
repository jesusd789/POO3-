public class CajeroAutomatico implements OperacionBancaria {
    @Override
    public void transferir(String cuentaDestino, double monto) {
        // El cajero no transfiere: método vacío forzado
    }

    @Override
    public void retirar(double monto) {
        System.out.println("Cajero: retirando $" + monto);
    }

    @Override
    public void pagarFactura(String factura, double monto) {
        // El cajero no paga facturas: método vacío forzado
    }
}
