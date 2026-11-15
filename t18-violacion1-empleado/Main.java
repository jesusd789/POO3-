public class Main {
    public static void main(String[] args) {
        System.out.println("--- ISP Violación 1: interfaz Empleado con métodos innecesarios ---");
        Empleado cocinero = new CocineroEmpleado();

        cocinero.cocinar();

        System.out.println("Llamando limpiar() sobre el cocinero...");
        cocinero.limpiar();
        System.out.println("(No pasó nada: método vacío obligado por la interfaz)");

        System.out.println("Llamando atenderMesas() sobre el cocinero...");
        cocinero.atenderMesas();
        System.out.println("(No pasó nada: el cliente de la interfaz cree que funciona)");
    }
}
