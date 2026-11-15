public class Automovil implements Vehiculo {
    @Override
    public void conducir() {
        System.out.println("El automóvil se conduce por la ciudad.");
    }

    @Override
    public void cargarMercancias() {
        // Un automóvil de pasajeros no carga mercancías: método vacío forzado
    }
}
