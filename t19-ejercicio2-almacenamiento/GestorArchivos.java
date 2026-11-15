/** Módulo de alto nivel: depende de la abstracción Almacenamiento. */
public class GestorArchivos {
    private final Almacenamiento almacenamiento;

    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void subir(String nombre, String contenido) {
        almacenamiento.guardar(nombre, contenido);
    }

    public void descargar(String nombre) {
        String contenido = almacenamiento.recuperar(nombre);
        System.out.println("Contenido recuperado: " + contenido);
    }
}
