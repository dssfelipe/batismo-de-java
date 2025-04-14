package FormaGeometrica;

public class Triangulo extends Formas{
    double lado1, lado2, lado3;

    public Triangulo(double l1, double l2, double l3){
        this.lado1 = l1;
        this.lado2 = l2;
        this.lado3 = l3;
    }

    public double calcularPerimetro(){
        return lado1 + lado2 + lado3;
    }
}



