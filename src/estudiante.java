package src;

public class estudiante {
//atributos 
    String nombre; 
    String apellido; 
    int edad ;
    String carrera; 
    double promedio ; 

    //constructor sin parametros 
    public estudiante (){
        //puede estar vacio o inicializar valores por defecto 
    }
// constructor con parametros 
public estudiante (String nombre, String apellido, int edad, String carrera, double promedio ) {
    this.nombre = nombre; 
    this.apellido = apellido;
    this.edad = edad;
    this.carrera = carrera ; 
    this.promedio = promedio; 
}

public static void main (String []args) {
    //objetos con constructructor sin parametros y asignar atributos luego
    estudiante e1 = new estudiante(); 
    e1.nombre = "Ana"; 
    e1.apellido = "Gomez"; 
    e1.edad = 20; 
    e1.carrera = "Ingeniería"; 
    e1.promedio = 8.5;  

    estudiante  e2 = new estudiante();
    e2.nombre = "Luis";
    e2.apellido = "Perez"; 
    e2.edad = 22; 
    e2.carrera = "Medicina"; 
    e2.promedio = 9.0;

    // crear objeto con constructor con párametros 
    
    estudiante e3 = new estudiante("Maria","Lopez",21,"Derecho",8.8);
    
    //Arreglo de estudiante 
    estudiante [] estudiantes = {e1,e2,e3}; 

    // recorrer arreglo e imprimir nombre y promedio 
     
    for (estudiante est: estudiantes) {
        System.out.println ("Nombre:"+est.nombre + ",Promedio:"+ est.promedio);
    }

}





}
