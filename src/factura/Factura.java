
package factura;

public class Factura implements Constantes, Variaciones{
       private double totalSinIVA;
    public final static double IVA = 0.16;
 
    public double sinIVA() {
        return this.totalSinIVA;
    }
 
    public double conIVA() {
        return this.totalSinIVA * (1+IVA);
    }
 
       @Override
    public void asignaValor(double x) {
        if (Factura.valorMinimo<x)
            this.totalSinIVA=x;
        else
            this.totalSinIVA=0;
    }
 
       @Override
    public void rebaja(double t) {
        this.totalSinIVA *= (1-t/100);
    }
    
    public static void main(String[] args) {
        Factura a = new Factura();
        a.asignaValor(1500);
 
        System.out.println("El precio sin IVA es: " + a.sinIVA());
        System.out.println("El precio con IVA es: " + a.conIVA());
        System.out.println("Rebajado durante el mes de noviembre un 20%");
 
        a.rebaja(20);
        System.out.println("Rebajado sin IVA es: " + a.sinIVA());
        System.out.println("Rebajado con IVA es: " + a.conIVA());
    }
    
}
