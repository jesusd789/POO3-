import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- DIP Ejercicio 3: Sistema de reportes ---");
        List<String> datos = Arrays.asList("Ventas: 1200", "Gastos: 800", "Utilidad: 400");

        GestorReportes gestor = new GestorReportes(new ReportePDF());
        gestor.crearReporte("Resumen mensual", datos);

        System.out.println();
        gestor = new GestorReportes(new ReporteExcel());
        gestor.crearReporte("Resumen mensual", datos);
    }
}
