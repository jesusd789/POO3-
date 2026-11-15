public class Main {
    public static void main(String[] args) {
        System.out.println("--- Ejercicio 1 ANTES (viola ISP): una sola interfaz Mantenimiento ---");
        Mantenimiento tecnico = new Tecnico();
        Mantenimiento conserje = new Conserje();

        tecnico.reparar();
        tecnico.limpiar();   // no hace nada
        conserje.reparar();  // no hace nada
        conserje.limpiar();
        System.out.println("(Dos llamadas no hicieron nada: métodos vacíos obligados)");
    }
}
