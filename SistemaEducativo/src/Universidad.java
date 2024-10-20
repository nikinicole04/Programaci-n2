public class Universidad {
    private String nombreUniversidad;
    private String direccionUniversidad;
    private String telefonoUniversidad;


        // Constructor 1 (sin parámetros)

         public Universidad() {

            this.nombreUniversidad = "No hay";
        this.direccionUniversidad = "No hay";
        this.telefonoUniversidad = "No hay";
    }
    // Constructor 2 (con parámetros)
    public Universidad(String nombreUniversidad, String direccionUniversidad, String telefonoUniversidad) {
        this.nombreUniversidad = nombreUniversidad;
        this.direccionUniversidad = direccionUniversidad;
        this.telefonoUniversidad = telefonoUniversidad;

    }

    public String getNombreUniversidad() {
        return nombreUniversidad;
    }

    public void setNombreUniversidad(String nombreUniversidad) {
        this.nombreUniversidad = nombreUniversidad;
    }

    public String getDireccionUniversidad() {
        return direccionUniversidad;
    }

    public void setDireccionUniversidad(String direccionUniversidad) {
        this.direccionUniversidad = direccionUniversidad;
    }

    public String getTelefonoUniversidad() {
        return telefonoUniversidad;
    }

    public void setTelefonoUniversidad(String telefonoUniversidad) {
        this.telefonoUniversidad = telefonoUniversidad;
    }
}
