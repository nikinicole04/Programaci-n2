import java.util.Scanner;

public class Universidad {
    private String nombreUniversidad;
    private String direccion;
    private String telefono;

    // Constructor sin parámetros
    public Universidad() {}

    // Getters y Setters
    public String getNombreUniversidad() {
        return nombreUniversidad;
    }

    public void setNombreUniversidad(String nombreUniversidad) {
        this.nombreUniversidad = nombreUniversidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Método para ingresar datos
    public void ingresarDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la universidad: ");
        nombreUniversidad = scanner.nextLine();
        System.out.print("Ingrese la dirección de la universidad: ");
        direccion = scanner.nextLine();
        System.out.print("Ingrese el teléfono de la universidad: ");
        telefono = scanner.nextLine();
    }

    // Método para mostrar datos
    public void mostrarInfo() {
        System.out.println("Universidad: " + nombreUniversidad);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
    }
}
