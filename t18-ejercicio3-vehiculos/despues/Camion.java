public class Camion implements Conducible, TransportaMercancias {
    @Override
    public void conducir() {
        System.out.println("El camión se conduce por la carretera.");
    }

    @Override
    public void cargarMercancias() {
        System.out.println("El camión carga mercancías en su plataforma.");
    }
}
