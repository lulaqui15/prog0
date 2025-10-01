package src;
import java.util.ArrayList;
import java.util.List;  
// Clase Carrera
public class Carrera {
    private String nombre;
    private List<Estudiante> estudiantes;

    public Carrera(String nombre) {
        this.nombre = nombre;
        estudiantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null) {
            nombre = "";
        }
        this.nombre = nombre.trim();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        if (estudiante != null) {
            estudiantes.add(estudiante);
        }
    }

    public void listarEstudiantes() {
        System.out.println("Estudiantes de la carrera " + nombre + ":");
        for (Estudiante e : estudiantes) {
            System.out.println("- " + e);
        }
    }

    public Estudiante buscarEstudiante(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            return null;
        }
        String nombreBuscado = nombre.trim().toLowerCase();
        for (Estudiante e : estudiantes) {
            if (e.getNombre().toLowerCase().equals(nombreBuscado)) {
                return e;
            }
        }
        return null;
    }
}

