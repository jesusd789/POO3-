public class Remolque implements Vehiculo {
    @Override
    public void conducir() {
        // Un remolque no se conduce: método vacío forzado
    }

    @Override
    public void cargarMercancias() {
        System.out.println("El remolque carga mercancías.");
    }
}
