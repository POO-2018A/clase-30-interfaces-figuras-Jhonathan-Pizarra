package figuras;

/**
 *
 * @author HP
 */
public class Triangulo implements Figuras{
    
    private double lado1;
    private double lado2;
    private double lado3;
    
    private double base;
    private double altura;

    //Constructor Area
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //Constructor Perimetro
    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    
    

    @Override
    public double calcularArea() {
        
        double area = ((base*altura)/(2.0));
        return area;
    }

    @Override
    public double calcularPerimetro() {
     
        //Suponiendo que es un trinagulo equilátero:
        double perimetro = lado1*lado2*lado3;
        return perimetro;
    
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
    
    
    
}
