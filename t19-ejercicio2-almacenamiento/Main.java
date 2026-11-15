public class Main {
    public static void main(String[] args) {
        System.out.println("--- DIP Ejercicio 2: Sistema de almacenamiento de archivos ---");
        GestorArchivos gestor = new GestorArchivos(new AlmacenamientoLocal());
        gestor.subir("notas.txt", "Apuntes de POO");
        gestor.descargar("notas.txt");

        System.out.println();
        gestor = new GestorArchivos(new AlmacenamientoNube());
        gestor.subir("informe.txt", "Informe de la Unidad 3");
        gestor.descargar("informe.txt");
    }
}
