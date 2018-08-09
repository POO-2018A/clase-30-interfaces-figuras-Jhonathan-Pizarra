
package figuras;

/**
 *
 * @author HP
 */
public class Rectangulo implements Figuras {
    
    double lado;
    double lado2;

    public Rectangulo(double lado, double lado2) {
        this.lado = lado;
        this.lado2 = lado2;
    }
    
    

    
    @Override
    public double calcularArea() {
        
        double area = lado*lado2;
        return area;
    }

    @Override
    public double calcularPerimetro() {
    
        double perimetro = (2.0)*lado+(2.0)*lado2;
        return perimetro;
    }
    
    
    
}
