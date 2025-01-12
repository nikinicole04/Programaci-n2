package udla.Jvasquez.java.jdbc;

public class Proveedor {

    // Metodo para vender un producto
    public static void venderProducto(Inventario inventario, String nombreProducto, int cantidadVenta) {
        Producto producto = inventario.buscarProductoPorNombre(nombreProducto);

        if (producto == null) {
            System.out.println("El producto no existe en el inventario.");
            return;
        }

        int cantidadDisponible = producto.getCantidad();

        if (cantidadVenta <= cantidadDisponible) {
            // Reducir la cantidad del producto en la lista
            producto.setCantidad(cantidadDisponible - cantidadVenta);
            System.out.println("Se vendieron " + cantidadVenta + " unidades de " + nombreProducto + ".");

            // Verificar si la cantidad es menor a 5
            if (producto.getCantidad() < 5) {
                System.out.println("¡Alerta! La cantidad de " + nombreProducto + " es baja. Necesita más productos del proveedor.");
            }

            // Sincronizar el inventario con la base de datos
            inventario.sincronizarConBaseDeDatos();
        } else {
            System.out.println("No hay suficiente stock para vender esa cantidad.");
        }
    }
}