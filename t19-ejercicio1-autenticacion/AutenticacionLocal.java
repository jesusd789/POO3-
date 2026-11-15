import java.util.HashMap;
import java.util.Map;

/** Autentica contra usuarios y contraseñas guardados localmente. */
public class AutenticacionLocal implements ServicioAutenticacion {
    private final Map<String, String> usuarios = new HashMap<>();

    public AutenticacionLocal() {
        usuarios.put("jesus", "1234");
        usuarios.put("laura", "abcd");
    }

    @Override
    public boolean autenticar(String usuario, String credencial) {
        System.out.println("[Local] Verificando usuario " + usuario + " en la base local...");
        return credencial.equals(usuarios.get(usuario));
    }
}
