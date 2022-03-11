package ejercicio2;

import static java.lang.Character.toUpperCase;
import static java.util.Locale.US;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

public class Electrodomestico {

    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(US);
    private double precio;
    private String colorElectro;
    private char consumoEnergetico;
    private double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String colorElectro, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.colorElectro = colorElectro;
        this.comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;

    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColorElectro() {
        return colorElectro;
    }

    public void setColorElectro(String colorElectro) {
        this.comprobarColor(colorElectro);
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.comprobarConsumoEnergetico(consumoEnergetico);
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    private void comprobarConsumoEnergetico(char letra) {
        toUpperCase(letra);
        if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'E' || letra == 'F') {
            this.consumoEnergetico = letra;
        } else {
            this.consumoEnergetico = 'F';
        }

    }

    private void comprobarColor(String color) {
        toLowerCase(color);
        if ("blanco".equals(color) || "negro".equals(color) || "rojo".equals(color) || "azul".equals(color) || "gris".equals(color)) {
            this.colorElectro = color;
        } else {
            this.colorElectro = "blanco";
        }
    }

    protected void crearElectrodomestico() {
        System.out.println("Ingrese las caracteristicas del electrodomesstico:");
        System.out.println("Peso:");
        this.peso = (leer.nextDouble());
        
        System.out.println("el consumo energetico es:");
        this.setConsumoEnergetico(leer.next().charAt(0));
        System.out.println("el color es: ");
        this.setColorElectro(leer.next());
        

    }

    protected double calcularPrecio() {
        double auxPrecio = 1000;
        switch (this.getConsumoEnergetico()) {
            case 'A':
                auxPrecio =  auxPrecio +1000;
                break;
            case 'B':
                auxPrecio =  auxPrecio +800;
                break;
            case 'C':
                auxPrecio =  auxPrecio +600;
                break;
            case 'D':
                auxPrecio= auxPrecio+ 500;
                break;
            case 'E':
                auxPrecio =  auxPrecio +300;
                break;
            case 'F':
                auxPrecio =  auxPrecio +100;
                break;
        }

        if (this.getPeso() >= 1 && this.getPeso() <= 19) {
           auxPrecio = auxPrecio + 100;
        } else if (this.getPeso() >= 20 && this.getPeso() <= 49) {
            auxPrecio = auxPrecio+ 500;
        } else if (this.getPeso() >= 50 && this.getPeso() <= 79) {
            auxPrecio = auxPrecio + 800;
        } else {
            auxPrecio = auxPrecio + 1000;
        }
         return auxPrecio; 
    }
    
    protected void precioFinal(){
        this.precio= calcularPrecio();
    }
}
    
    
    




