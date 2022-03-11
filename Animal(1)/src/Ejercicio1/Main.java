
package Ejercicio1;


public class Main {

    public static void main(String[] args) {
       
      Animal perro= new Perro("Odie", "proplan", "Bull Dog", 3);  
   perro.alimentacion();
   
   Animal gato= new Gato("Fulgen", "Sabrocito", "Michi", 2);
   gato.alimentacion();
   
   Animal caballo= new Caballo("Ponito", "Pasto", "Caballo", 10);
   caballo.alimentacion();
   
    }
    
}
