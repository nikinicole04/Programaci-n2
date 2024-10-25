import java.util.Scanner;

public class SistemaPosiciones {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de jugadoras en el equipo: ");
        int cantidadJugadoras = entrada.nextInt();
        entrada.nextLine(); // Limpiar el buffer

        Jugadora[] equipo = new Jugadora[cantidadJugadoras];

        // Ingresar datos de cada jugadora
        for (int i = 0; i < cantidadJugadoras; i++) {
            equipo[i] = new Jugadora();

            System.out.println("\nIngrese los datos de la jugadora " + (i + 1) + ":");

            System.out.print("Nombre de la jugadora: ");
            String nombre = entrada.nextLine();
            equipo[i].establecerNombre(nombre);

            System.out.print("Posición de la jugadora (por ejemplo: portera, defensa, mediocampista, delantera): ");
            String posicion = entrada.nextLine();
            equipo[i].establecerPosicion(posicion);
        }

        // Mostrar posiciones de las jugadoras
        System.out.println("\nPosiciones de las jugadoras en el equipo:");
        for (int i = 0; i < cantidadJugadoras; i++) {
            equipo[i].mostrarInfo();
        }

        entrada.close();
    }
}
