package src;

import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private String direccion;
    private List<Estudiante> estudiantes;

    public Universidad(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.estudiantes = new ArrayList<>();
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    // Método para agregar estudiante.
    public void agregarEstudiante(Estudiante estudiante) {
        if (estudiante != null) {
            estudiantes.add(estudiante);
        }
    }

    // listar estudiantes
    public void listarEstudiantes() {
        System.out.println("Estudiantes de la universidad " + nombre + ":");
        for (Estudiante e : estudiantes) {
            System.out.println(e.getNombre() + " " + e.getApellido() + " - Promedio: " + String.format("%.2f", e.getPromedio()));
        }
    }
}
