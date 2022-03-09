
package Ejercicio1;


class Gato extends Animal{

    public Gato(String nombre, String alimento, String raza, int edad) {
        super(nombre, alimento, raza, edad);
    }
    
    @Override 
    public void alimentacion(){
        System.out.println("El gato se alimenta de : " + this.getAlimento() );
    }
}
