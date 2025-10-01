package src;

public class App {
    public static void main(String[] args) {
        // Crear estudiantes con constructor sin parámetros
        Estudiante e1 = new Estudiante();
        e1.setNombre("Ana");
        e1.setApellido("Gómez");
        e1.setEdad(20);
        e1.setCarrera("Ingeniería");

        Estudiante e2 = new Estudiante();
        e2.setNombre("Luis");
        e2.setApellido("Pérez");
        e2.setEdad(22);
        e2.setCarrera("Medicina");

        // Crear estudiante con constructor con parámetros
        Estudiante e3 = new Estudiante("María", "López", 19, "Derecho", 0);

        // Crear materias
        Materia m1 = new Materia("Matemáticas", "MAT101", 4, 8.5);
        Materia m2 = new Materia("Física", "FIS101", 3, 7.0);
        Materia m3 = new Materia("Química", "QUI101", 3, 9.0);

        // Asignar materias a estudiantes
        e1.agregarMateria(m1);
        e1.agregarMateria(m2);

        e2.agregarMateria(m3);

        e3.agregarMateria(m1);
        e3.agregarMateria(m3);

        // Arreglo de estudiantes
        Estudiante[] estudiantes = {e1, e2, e3};

        // Imprimir nombre y promedio de cada estudiante
        System.out.println("Estudiantes y sus promedios:");
        for (Estudiante e : estudiantes) {
            System.out.println(e.getNombre() + " - Promedio: " + String.format("%.2f", e.getPromedio()));
        }

        // Crear carrera y agregar estudiantes
        Carrera carrera = new Carrera("Ingeniería");
        carrera.agregarEstudiante(e1);
        carrera.agregarEstudiante(e2);
        carrera.agregarEstudiante(e3);

        // Listar estudiantes de la carrera
        System.out.println();
        carrera.listarEstudiantes();

        // Buscar estudiante por nombre. 
        String nombreBuscado = "Luis";
        Estudiante encontrado = carrera.buscarEstudiante(nombreBuscado);
        if (encontrado != null) {
            System.out.println("\nEstudiante encontrado: " + encontrado.getNombre() + " " + encontrado.getApellido());
        } else {
            System.out.println("\nEstudiante " + nombreBuscado + " no encontrado.");
        }
    }
}
