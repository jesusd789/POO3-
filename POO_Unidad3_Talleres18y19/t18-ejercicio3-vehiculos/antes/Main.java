public class Main {
    public static void main(String[] args) {
        System.out.println("--- Ejercicio 3 ANTES (viola ISP): una sola interfaz Vehiculo ---");
        Vehiculo auto = new Automovil();
        Vehiculo remolque = new Remolque();

        auto.conducir();
        auto.cargarMercancias();     // no hace nada
        remolque.conducir();         // no hace nada
        remolque.cargarMercancias();
        System.out.println("(Dos llamadas no hicieron nada: métodos vacíos obligados)");
    }
}
