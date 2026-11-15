/** Un operario que hace ambas tareas implementa ambas interfaces. */
public class OperarioGeneral implements Reparable, Limpiable {
    @Override
    public void reparar() {
        System.out.println("El operario general repara una avería.");
    }

    @Override
    public void limpiar() {
        System.out.println("El operario general limpia el taller.");
    }
}
