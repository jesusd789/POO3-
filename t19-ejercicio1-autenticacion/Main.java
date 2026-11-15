public class Main {
    public static void main(String[] args) {
        System.out.println("--- DIP Ejercicio 1: Sistema de autenticación ---");
        GestorAutenticacion gestor = new GestorAutenticacion(new AutenticacionLocal());
        gestor.iniciarSesion("jesus", "1234");
        gestor.iniciarSesion("jesus", "mala");

        System.out.println();
        gestor = new GestorAutenticacion(new AutenticacionOAuth());
        gestor.iniciarSesion("laura", "token-abc123");
        gestor.iniciarSesion("laura", "sin-token");
    }
}
