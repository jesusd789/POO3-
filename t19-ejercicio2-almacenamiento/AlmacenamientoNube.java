import java.util.HashMap;
import java.util.Map;

/** Simula el guardado en un servicio en la nube (en memoria, para el ejemplo). */
public class AlmacenamientoNube implements Almacenamiento {
    private final Map<String, String> bucket = new HashMap<>();

    @Override
    public void guardar(String nombre, String contenido) {
        bucket.put(nombre, contenido);
        System.out.println("[Nube] Archivo subido al bucket: " + nombre);
    }

    @Override
    public String recuperar(String nombre) {
        System.out.println("[Nube] Descargando del bucket: " + nombre);
        return bucket.get(nombre);
    }
}
