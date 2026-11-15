// Interfaz inicial: todas las operaciones juntas
public interface OperacionBancaria {
    void transferir(String cuentaDestino, double monto);
    void retirar(double monto);
    void pagarFactura(String factura, double monto);
}
