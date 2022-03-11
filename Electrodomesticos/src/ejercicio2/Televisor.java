
package ejercicio2;


public class Televisor extends Electrodomestico {
    private int resolucionPulgadas;
    private boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(int resolucionPulgadas, boolean sintonizadorTDT) {
        this.resolucionPulgadas = resolucionPulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Televisor(int resolucionPulgadas, boolean sintonizadorTDT, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucionPulgadas = resolucionPulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucionPulgadas() {
        return resolucionPulgadas;
    }

    public void setResolucionPulgadas(int resolucionPulgadas) {
        this.resolucionPulgadas = resolucionPulgadas;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    
    
}
