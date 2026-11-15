// Clase ProcesadorPago (depende de la abstracción MetodoPago)
public class ProcesadorPago {
    private MetodoPago metodoPago;

    public ProcesadorPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void realizarPago(double monto) {
        metodoPago.procesarPago(monto);
    }
}
