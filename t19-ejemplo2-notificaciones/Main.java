// Clase de prueba
public class Main {
    public static void main(String[] args) {
        System.out.println("--- DIP Ejemplo 2: Sistema de notificaciones con inversión de dependencias ---");
        ServicioNotificacion emailService = new EmailService();
        Notificador notificador = new Notificador(emailService);
        notificador.notificar("juan@example.com", "Hola Juan!");

        ServicioNotificacion smsService = new SMSService();
        notificador = new Notificador(smsService);
        notificador.notificar("123456789", "Hola, este es un mensaje SMS.");
    }
}
