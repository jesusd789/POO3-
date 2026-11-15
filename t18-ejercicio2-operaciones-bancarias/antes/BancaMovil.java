public class BancaMovil implements OperacionBancaria {
    @Override
    public void transferir(String cuentaDestino, double monto) {
        System.out.println("Banca móvil: transfiriendo $" + monto + " a " + cuentaDestino);
    }

    @Override
    public void retirar(double monto) {
        // La app no entrega efectivo: método vacío forzado
    }

    @Override
    public void pagarFactura(String factura, double monto) {
        System.out.println("Banca móvil: pagando factura " + factura + " por $" + monto);
    }
}
