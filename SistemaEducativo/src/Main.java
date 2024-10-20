public class Main {
    public static void main(String[] args) {

        //Crear Instancia Universidad

Universidad universidad = new Universidad("Universad de las Americas",  "Ciclista",  " 0995027367");

        //Crear Instancia Estudiante

        Estudiantes estudiantes = new Estudiantes("Nicole", 1727734677, 9.8);

        //Crear Instancia Curso

        Curso curso = new Curso("Programacion", 3.2, 5);


        // Mostrar información de la Universidad
        universidad.mostrarInfoUniversidad();

        System.out.println();


        // Mostrar información del Estudiante
        estudiante.mostrarInfoEstudiante();

        System.out.println();

        // Mostrar información del Curso
        curso.mostrarInfoCurso();
    }
}