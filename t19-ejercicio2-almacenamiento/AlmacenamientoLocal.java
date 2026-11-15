import java.util.HashMap;
import java.util.Map;

/** Simula el guardado en el disco local (en memoria, para el ejemplo). */
public class AlmacenamientoLocal implements Almacenamiento {
    private final Map<String, String> disco = new HashMap<>();

    @Override
    public void guardar(String nombre, String contenido) {
        disco.put(nombre, contenido);
        System.out.println("[Local] Archivo guardado en disco: " + nombre);
    }

    @Override
    public String recuperar(String nombre) {
        System.out.println("[Local] Leyendo del disco: " + nombre);
        return disco.get(nombre);
    }
}
