public class Curso {
    private String materia;
    private int creditos;
    private String codigo;

    // Constructor 1 (sin parámetros)
    public Curso(){
        this.materia = "No hay materia";
        this.creditos = 0;
        this.codigo = "No hay codigo";
    }
    // Constructor 2 (con parámetros)
    public Curso(String materia, int creditos, String codigo){
        this.materia = materia;
        this.creditos = creditos;
        this.codigo = codigo;
    }
    //Getter y setters
    public String getMateria() {
        return materia;
    }

    public int getCreditos() {
        return creditos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
