/** Un servicio que realmente hace ambas cosas implementa ambas interfaces. */
public class ServicioNotificacionCompleto implements EnvioEmail, EnvioSMS {
    @Override
    public void enviarEmail(String destinatario, String mensaje) {
        System.out.println("[Completo] Email a " + destinatario + ": " + mensaje);
    }

    @Override
    public void enviarSMS(String numero, String mensaje) {
        System.out.println("[Completo] SMS a " + numero + ": " + mensaje);
    }
}
