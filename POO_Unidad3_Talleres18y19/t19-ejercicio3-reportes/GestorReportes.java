import java.util.List;

/** Módulo de alto nivel: depende de la abstracción GeneradorReporte. */
public class GestorReportes {
    private final GeneradorReporte generador;

    public GestorReportes(GeneradorReporte generador) {
        this.generador = generador;
    }

    public void crearReporte(String titulo, List<String> datos) {
        generador.generar(titulo, datos);
    }
}
