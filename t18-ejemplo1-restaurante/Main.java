public class Main {
    public static void main(String[] args) {
        System.out.println("--- ISP Ejemplo 1: Sistema de empleados de un restaurante ---");
        Cocinero cocinero = new CocineroEmpleado();
        Camarero camarero = new CamareroEmpleado();
        PersonalLimpieza limpieza = new LimpiezaEmpleado();

        cocinero.cocinar();
        camarero.atenderMesas();
        limpieza.limpiar();

        System.out.println();
        System.out.println("Empleado con dos roles (dos interfaces pequeñas):");
        CamareroPolivalente polivalente = new CamareroPolivalente();
        polivalente.atenderMesas();
        polivalente.limpiar();
    }
}
