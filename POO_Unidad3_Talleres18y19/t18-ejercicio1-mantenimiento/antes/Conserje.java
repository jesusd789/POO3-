public class Conserje implements Mantenimiento {
    @Override
    public void reparar() {
        // El conserje no repara: método vacío forzado
    }

    @Override
    public void limpiar() {
        System.out.println("El conserje limpia las instalaciones.");
    }
}
