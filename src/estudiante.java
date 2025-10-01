package src;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    // Atributos
    private String nombre;
    private String apellido;
    private int edad;
    private String carrera;
    private double promedio;
    private List<Materia> materias = new ArrayList<>();

    // Constructor sin parámetros
    public Estudiante() {
        
    }

    // Constructor con parámetros
    public Estudiante(String nombre, String apellido, int edad, String carrera, double promedio) {
        this(); 
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
        setCarrera(carrera);
        setPromedio(promedio);
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("El nombre no puede estar vacío");
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if (apellido != null && !apellido.isEmpty()) {
            this.apellido = apellido;
        } else {
            System.out.println("El apellido no puede estar vacío");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 16 && edad < 80) {
            this.edad = edad;
        } else {
            System.out.println("La edad debe estar entre 16 y 80 años");
        }
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        if (promedio >= 0.0 && promedio <= 10.0) {
            this.promedio = promedio;
        } else {
            System.out.println("El promedio debe estar entre 0.0 y 10.0");
        }
    }

    // Métodos para gestionar materias
    public void agregarMateria(Materia materia) {
        if (materia != null) {
            materias.add(materia);
            calcularPromedio(); 
        }
    }

    public void calcularPromedio() {
        if (materias.isEmpty()) {
            promedio = 0;
            return;
        }
        double suma = 0;
        for (Materia m : materias) {
            suma += m.getCalificacion();
        }
        promedio = suma / materias.size();
    }

    public String toString() {
        return nombre + " " + apellido + " - Promedio: " + String.format("%.2f", promedio);
    }
}
