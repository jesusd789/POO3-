public class Tecnico implements Mantenimiento {
    @Override
    public void reparar() {
        System.out.println("El técnico repara el equipo.");
    }

    @Override
    public void limpiar() {
        // El técnico no limpia: método vacío forzado
    }
}
