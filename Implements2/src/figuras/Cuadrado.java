
package figuras;

/**
 *
 * @author HP
 */
public class Cuadrado implements Figuras {
    
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    
    //...............
    @Override
    public double calcularArea() {
       
        double area = lado*lado;
        return area;
    
    }

    @Override
    public double calcularPerimetro() {
       
        double perimetro = lado+lado+lado+lado;
        return perimetro;
    
    }
    //.............

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    
    
    
    
    
}
