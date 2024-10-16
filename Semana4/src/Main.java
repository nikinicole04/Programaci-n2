public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Flor
        Flor rosa = new Flor();

        // Asignar valores usando setters
        rosa.setNombre("Rosa");
        rosa.setColor("Rojo");
        rosa.setAltura(50.0);
        rosa.setTemporada("Primavera");

        // Acceder a los valores usando getters y mostrar la información
        System.out.println("Nombre: " + rosa.getNombre());
        System.out.println("Color: " + rosa.getColor());
        System.out.println("Altura: " + rosa.getAltura() + " cm");
        System.out.println("Temporada: " + rosa.getTemporada());

        // También puedes llamar al método para mostrar la información directamente
        rosa.mostrarInformacion();

        // Verificar si es la temporada de floración
        System.out.println("¿Es temporada de floración? " + rosa.esTemporada("Primavera"));
    }
}