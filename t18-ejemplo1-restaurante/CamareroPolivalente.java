/** Un empleado que SI cumple dos roles implementa las dos interfaces que necesita. */
public class CamareroPolivalente implements Camarero, PersonalLimpieza {
    @Override
    public void atenderMesas() {
        System.out.println("El camarero polivalente atiende las mesas.");
    }

    @Override
    public void limpiar() {
        System.out.println("El camarero polivalente también limpia.");
    }
}
