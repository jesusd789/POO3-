/** Simula la validación de un token de un proveedor OAuth externo. */
public class AutenticacionOAuth implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String credencial) {
        System.out.println("[OAuth] Validando token del usuario " + usuario + " con el proveedor...");
        return credencial.startsWith("token-");
    }
}
