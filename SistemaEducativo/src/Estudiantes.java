public class Estudiantes {
    private   String nombre;
    private String cedula;
    private  double nota;

    // Constructor 1 (sin parámetros)
    public Estudiantes() {
        this.nombre = "Sin nombre";
        this.cedula = "No registra";
        this.nota = 0.0;
    }
    // Constructor 2 (con parámetros)
    public Estudiantes(String nombre, String cedula, double nota) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.nota = nota;
    }

    //Getter y setters

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public double getNota() {
        return nota;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;

    }

    public void setNota(double nota) {
        this.nota = nota;
    }

}
