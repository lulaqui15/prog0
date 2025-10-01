      package src;
      
public class Materia {
   private  String nombre;
    private String codigo;
    private int creditos;
    private double calificacion;

    public Materia() {
    }

    Materia(String nombre, String codigo, int creditos, double calificacion) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
        this.calificacion = calificacion;
    }
    // Getters y setters.
      public String getNombre() {
         return nombre;
      } 
      public void setNombre(String nombre) {
         this.nombre = nombre;
      }
      public String getCodigo() {
         return codigo;
      }
      public void setCodigo(String codigo) {
         this.codigo = codigo;
      }
      public int getCreditos() {
         return creditos;
      }
      public void setCreditos(int creditos) {
         this.creditos = creditos;
      }       
      public double getCalificacion() {
         return calificacion;
      }
       public void setCalificacion(double calificacion) {
        if (calificacion < 0 || calificacion > 10) {
         
             this.calificacion = calificacion;
        } else {
            System.out.println("La calificación debe estar entre 0 y 10.");   
        }
      
    }
    
    public String toString() {
        return "Materia: " + nombre +
               " | Código: " + codigo +
               " | Créditos: " + creditos +
               " | Calificación: " + calificacion;
    }
}







