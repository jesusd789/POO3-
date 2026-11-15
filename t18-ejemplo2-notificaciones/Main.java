public class Main {
    public static void main(String[] args) {
        System.out.println("--- ISP Ejemplo 2: Sistema de notificaciones ---");
        EnvioEmail email = new ServicioNotificacionEmail();
        EnvioSMS sms = new ServicioNotificacionSMS();

        email.enviarEmail("juan@example.com", "Hola Juan!");
        sms.enviarSMS("123456789", "Hola, este es un mensaje SMS.");

        System.out.println();
        ServicioNotificacionCompleto completo = new ServicioNotificacionCompleto();
        completo.enviarEmail("ana@example.com", "Bienvenida");
        completo.enviarSMS("987654321", "Bienvenida");
    }
}
