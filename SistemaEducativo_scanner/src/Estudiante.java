import java.util.Scanner;

public class Estudiante {
    private String nombre;
    private int edad;
    private String matricula;
    private double nota;

    // Constructor sin parámetros
    public Estudiante() {}

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    // Método para ingresar datos
    public void ingresarDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del estudiante: ");
        nombre = scanner.nextLine();
        System.out.print("Ingrese la edad del estudiante: ");
        edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Ingrese la matrícula del estudiante: ");
        matricula = scanner.nextLine();
        System.out.print("Ingrese la nota del estudiante: ");
        nota = scanner.nextDouble();
    }

    // Método para mostrar datos
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota: " + nota);
    }
}
