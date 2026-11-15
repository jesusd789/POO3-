public class Main {
    public static void main(String[] args) {
        System.out.println("--- ISP Violación 2: interfaz Notificacion con métodos irrelevantes ---");
        Notificacion servicio = new ServicioEmail();

        servicio.enviarEmail("juan@example.com", "Hola Juan!");

        System.out.println("Intentando enviar un SMS con ServicioEmail...");
        servicio.enviarSMS("123456789", "Hola, este es un SMS.");
        System.out.println("(El SMS nunca se envió y no hubo ningún aviso)");
    }
}
