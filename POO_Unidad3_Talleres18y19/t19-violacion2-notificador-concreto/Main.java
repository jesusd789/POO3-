public class Main {
    public static void main(String[] args) {
        System.out.println("--- DIP Violación 2: Notificador depende de EmailService ---");
        Notificador notificador = new Notificador(new EmailService());
        notificador.notificar("juan@example.com", "Hola Juan!");

        System.out.println("No se puede cambiar a SMS sin modificar la clase Notificador.");
    }
}
