package udla.Jvasquez.java.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Producto> productos;
    private String url = "jdbc:mysql://localhost:3306/java_jdbc";
    private String user = "root";
    private String password = "sasa";

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    // Metodo para agregar productos a nuestra lista
    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado: " + producto);
    }

    // Metodo para mostrar productos desde la base de datos
    public void mostrarProductosDesdeBaseDeDatos() {
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            String query = "SELECT * FROM productos";
            Statement st = conn.createStatement();
            ResultSet resultado = st.executeQuery(query);

            System.out.println("Productos en la base de datos:");
            if (!resultado.isBeforeFirst()) {
                System.out.println("No hay productos en la base de datos.");
            } else {
                    System.out.println("Id     Producto     Cantidad     Fecha Venc");
                while (resultado.next()) {
                    System.out.print(resultado.getInt("id"));
                    System.out.print("      ");
                    System.out.print(resultado.getString("producto"));
                    System.out.print("        ");
                    System.out.print(resultado.getInt("cantidad"));
                    System.out.print("        ");
                    System.out.println(resultado.getString("fechavenc"));
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar productos desde la base de datos: " + e.getMessage());
        }
    }

    // Metodo para eliminar un producto por nombre
    public void eliminarProductoPorNombre(String nombre) {
        // Eliminar de la lista
        boolean removedFromList = productos.removeIf(producto -> producto.getNombre().equalsIgnoreCase(nombre));
        if (removedFromList) {
            System.out.println("Producto(s) con nombre '" + nombre + "' eliminado(s) de la lista.");
        } else {
            System.out.println("No se encontraron productos con el nombre '" + nombre + "' en la lista.");
        }

        // Eliminar de la base de datos
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            String query = "DELETE FROM productos WHERE producto = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, nombre);
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Producto(s) con nombre '" + nombre + "' eliminado(s) de la base de datos.");
            } else {
                System.out.println("No se encontraron productos con el nombre '" + nombre + "' en la base de datos.");
            }
        } catch (SQLException e) {
            System.out.println("Error al eliminar producto de la base de datos: " + e.getMessage());
        }
    }

    // Metodo para sincronizar nuestra lista con la base de datos
    public void sincronizarConBaseDeDatos() {
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            for (Producto producto : productos) {
                // Verificar si el producto ya existe en la base de datos
                String querySelect = "SELECT * FROM productos WHERE producto = ?";
                PreparedStatement psSelect = conn.prepareStatement(querySelect);
                psSelect.setString(1, producto.getNombre());
                ResultSet resultado = psSelect.executeQuery();

                if (resultado.next()) {
                    // Si el producto existe, actualizamos la cantidad
                    String queryUpdate = "UPDATE productos SET cantidad = ? WHERE producto = ?";
                    PreparedStatement psUpdate = conn.prepareStatement(queryUpdate);
                    psUpdate.setInt(1, producto.getCantidad());
                    psUpdate.setString(2, producto.getNombre());
                    psUpdate.executeUpdate();
                    System.out.println("Producto actualizado: " + producto.getNombre());
                } else {
                    // Si no existe, lo insertamos como un nuevo producto
                    String queryInsert = "INSERT INTO productos (producto, cantidad, fechavenc) VALUES (?, ?, ?)";
                    PreparedStatement psInsert = conn.prepareStatement(queryInsert);
                    psInsert.setString(1, producto.getNombre());
                    psInsert.setInt(2, producto.getCantidad());
                    psInsert.setString(3, producto.getFechaVencimiento());
                    psInsert.executeUpdate();
                    System.out.println("Producto insertado: " + producto.getNombre());
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al sincronizar con la base de datos: " + e.getMessage());
        }
    }


    // Método para buscar un producto por nombre
    public Producto buscarProductoPorNombre(String nombre) {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null;
    }
}