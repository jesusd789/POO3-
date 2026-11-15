/** Módulo de alto nivel: depende de la abstracción, no de una implementación. */
public class GestorAutenticacion {
    private final ServicioAutenticacion servicio;

    public GestorAutenticacion(ServicioAutenticacion servicio) {
        this.servicio = servicio;
    }

    public void iniciarSesion(String usuario, String credencial) {
        if (servicio.autenticar(usuario, credencial)) {
            System.out.println("Acceso concedido a " + usuario);
        } else {
            System.out.println("Acceso denegado a " + usuario);
        }
    }
}
