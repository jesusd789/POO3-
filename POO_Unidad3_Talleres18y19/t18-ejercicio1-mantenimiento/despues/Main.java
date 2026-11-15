public class Main {
    public static void main(String[] args) {
        System.out.println("--- Ejercicio 1 DESPUÉS (aplica ISP): Reparable y Limpiable ---");
        Reparable tecnico = new Tecnico();
        Limpiable conserje = new Conserje();
        OperarioGeneral operario = new OperarioGeneral();

        tecnico.reparar();
        conserje.limpiar();
        operario.reparar();
        operario.limpiar();
    }
}
