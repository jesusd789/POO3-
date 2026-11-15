public class Main {
    public static void main(String[] args) {
        System.out.println("--- Ejercicio 3 DESPUÉS (aplica ISP): Conducible y TransportaMercancias ---");
        Conducible auto = new Automovil();
        Camion camion = new Camion();
        TransportaMercancias remolque = new Remolque();

        auto.conducir();
        camion.conducir();
        camion.cargarMercancias();
        remolque.cargarMercancias();
    }
}
