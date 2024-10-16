
public class Flor {
    // Atributos
    private String nombre;
    private String color;
    private double altura;
    private String temporada;

    // Constructor vacío
    public Flor() {
    }

    // Getters y Setters para cada atributo
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    // Método para mostrar la información de la flor
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Color: " + color);
        System.out.println("Altura: " + altura + " cm");
        System.out.println("Temporada: " + temporada);
    }