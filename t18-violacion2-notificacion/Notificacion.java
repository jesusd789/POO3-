// Interfaz Notificacion (VIOLA ISP: mezcla email y SMS)
public interface Notificacion {
    void enviarEmail(String destinatario, String mensaje);
    void enviarSMS(String numero, String mensaje);
}
