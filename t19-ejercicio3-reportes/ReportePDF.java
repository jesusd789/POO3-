import java.util.List;

public class ReportePDF implements GeneradorReporte {
    @Override
    public void generar(String titulo, List<String> datos) {
        System.out.println("Generando reporte PDF: " + titulo);
        for (String d : datos) {
            System.out.println("  [PDF] " + d);
        }
    }
}
