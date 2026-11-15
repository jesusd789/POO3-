/** Una cuenta completa sí soporta las tres operaciones. */
public class CuentaCorriente implements Transferible, Retirable, PagoFacturas {
    @Override
    public void transferir(String cuentaDestino, double monto) {
        System.out.println("Cuenta corriente: transferencia de $" + monto + " a " + cuentaDestino);
    }

    @Override
    public void retirar(double monto) {
        System.out.println("Cuenta corriente: retiro de $" + monto);
    }

    @Override
    public void pagarFactura(String factura, double monto) {
        System.out.println("Cuenta corriente: pago de factura " + factura + " por $" + monto);
    }
}
