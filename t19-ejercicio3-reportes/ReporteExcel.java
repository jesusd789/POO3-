import java.util.List;

public class ReporteExcel implements GeneradorReporte {
    @Override
    public void generar(String titulo, List<String> datos) {
        System.out.println("Generando reporte Excel: " + titulo);
        int fila = 1;
        for (String d : datos) {
            System.out.println("  [Excel] Fila " + fila++ + ": " + d);
        }
    }
}
