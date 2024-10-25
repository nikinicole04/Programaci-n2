import java.util.Scanner;

public class SistemaGestionEducativa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear instancias de las clases
        Universidad universidad = new Universidad();
        Estudiante estudiante = new Estudiante();
        Curso curso = new Curso();

        // Ingresar datos
        System.out.println("Ingrese los datos de la universidad:");
        universidad.ingresarDatos();

        System.out.println("\nIngrese los datos del estudiante:");
        estudiante.ingresarDatos();

        System.out.println("\nIngrese los datos del curso:");
        curso.ingresarDatos();

        // Mostrar datos
        System.out.println("\nDatos de la universidad:");
        universidad.mostrarInfo();

        System.out.println("\nDatos del estudiante:");
        estudiante.mostrarInfo();

        System.out.println("\nDatos del curso:");
        curso.mostrarInfo();

        scanner.close();
    }
}
