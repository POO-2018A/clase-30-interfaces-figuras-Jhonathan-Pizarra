
package figuras;


public class Circulo implements Figuras{
    
    double radio;

    public Circulo(double radio) {
        
        
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
       
        double area = (radio*radio)*(Figuras.PI);
        return area;
    }

    @Override
    public double calcularPerimetro() {
       
        double permietro = 2.0*(Figuras.PI)*(radio);
        return permietro;
    
    }
    
    
    
    
    
    
    
}
