// Clase EmailService que implementa ServicioNotificacion
public class EmailService implements ServicioNotificacion {
    @Override
    public void enviarMensaje(String destinatario, String mensaje) {
        System.out.println("Enviando email a: " + destinatario);
        System.out.println("Mensaje: " + mensaje);
    }
}
