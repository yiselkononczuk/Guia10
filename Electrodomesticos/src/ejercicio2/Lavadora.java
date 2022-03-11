
package ejercicio2;

public class Lavadora extends Electrodomestico{
    private double carga; 

    public Lavadora() {
    }

    public Lavadora(double carga) {
        this.carga = carga;
    }

    public Lavadora(double carga, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
    
    public void crearLavadora(){
        crearElectrodomestico();
        System.out.println("Ingrese la cantidad de kilogramos de la carga");
        this.carga= leer.nextDouble();
    }
    
 @Override 
    public void precioFinal(){
        double auxPrecio= this.calcularPrecio();
        if (this.carga>30){
            auxPrecio= auxPrecio +500;
         }
        this.setPrecio(auxPrecio) ;
    }
}
