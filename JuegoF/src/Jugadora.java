public class Jugadora {
    private String nombre;
    private String posicion;

    // Constructor sin parámetros
    public Jugadora() {
        nombre = "";
        posicion = "";
    }

    // Métodos para obtener y establecer el nombre y la posición
    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerPosicion() {
        return posicion;
    }

    public void establecerPosicion(String posicion) {
        this.posicion = posicion;
    }

    // Método para mostrar información de la jugadora
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Posición: " + posicion);
    }
}
