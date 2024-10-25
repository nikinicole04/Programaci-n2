import java.util.Scanner;

public class Curso {
    private String nombreCurso;
    private String codigoCurso;
    private int creditos;

    // Constructor sin parámetros
    public Curso() {}

    // Getters y Setters
    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    // Método para ingresar datos
    public void ingresarDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del curso: ");
        nombreCurso = scanner.nextLine();
        System.out.print("Ingrese el código del curso: ");
        codigoCurso = scanner.nextLine();
        System.out.print("Ingrese los créditos del curso: ");
        creditos = scanner.nextInt();
    }

    // Método para mostrar datos
    public void mostrarInfo() {
        System.out.println("Curso: " + nombreCurso);
        System.out.println("Código: " + codigoCurso);
        System.out.println("Créditos: " + creditos);
    }
}
