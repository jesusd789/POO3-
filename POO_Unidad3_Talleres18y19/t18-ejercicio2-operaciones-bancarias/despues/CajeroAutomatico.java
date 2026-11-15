public class CajeroAutomatico implements Retirable {
    @Override
    public void retirar(double monto) {
        System.out.println("Cajero: retirando $" + monto);
    }
}
