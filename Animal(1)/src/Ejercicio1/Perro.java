
package Ejercicio1;

class Perro extends Animal  {

    public Perro(String nombre, String alimento, String raza, int edad) {
        super(nombre, alimento, raza, edad);
    }
   
    @Override 
    public void alimentacion(){
        System.out.println("El perro se alimenta de : " + this.getAlimento() );
    }
}
