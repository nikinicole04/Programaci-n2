package udla.Jvasquez.java.jdbc;

import java.util.Scanner;

public class PrincipalJdbc {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("");
            System.out.println("*****Bienvenidos a Cafeteria Escolar Dulce Sabor*****");
            System.out.println("");
            System.out.println("Menú:");
            System.out.println("1. Mostrar productos en la base de datos");
            System.out.println("2. Agregar producto");
            System.out.println("3. Eliminar producto de la lista por nombre");
            System.out.println("4. Vender Productos");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea pendiente

            switch (opcion) {
                case 1:
                    inventario.mostrarProductosDesdeBaseDeDatos();
                    break;

                case 2:
                    Producto producto = ingresarProducto(scanner);
                    inventario.agregarProducto(producto);
                    inventario.sincronizarConBaseDeDatos();
                    break;

                case 3:
                    System.out.print("Ingrese el nombre del producto a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    inventario.eliminarProductoPorNombre(nombreEliminar);
                    break;

                case 4:
                   // Opción para vender un producto
                    System.out.print("Ingrese el nombre del producto a vender: ");
                    String nombreProductoVender = scanner.nextLine();

                    System.out.print("Ingrese la cantidad a vender: ");
                    int cantidadVenta = scanner.nextInt();
                    scanner.nextLine();  // Consumir la nueva línea pendiente

                    Proveedor.venderProducto(inventario, nombreProductoVender, cantidadVenta);
                    break;

                case 5:
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);

        scanner.close();
    }

    // Función para ingresar un nuevo producto
    private static Producto ingresarProducto(Scanner scanner) {
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la cantidad: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();  // Consumir la nueva línea pendiente

        System.out.print("Ingrese la fecha de vencimiento (YYYY-MM-DD): ");
        String fechaVencimiento = scanner.nextLine();

        return new Producto(0, nombre, cantidad, fechaVencimiento);  // Regresar el producto creado
    }
}
