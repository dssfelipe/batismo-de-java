package FormaGeometrica;

public class testeFormas {

    public static void main(String[] args) {

        Triangulo t = new Triangulo(3, 4, 5);
        quadrado q = new quadrado(4);
        circulo c = new circulo(2.5);

        System.out.println("Perimetro do triangulo: " + t.calcularPerimetro());
        System.out.println("Perimetro do quadrado: " + q.calcularPerimetro());
        System.out.println("Perimetro do circulo: " + c.calcularPerimetro());

        double total = t.calcularPerimetro() + q.calcularPerimetro() + c.calcularPerimetro();
        System.out.println("Soma dos perimetros: " + total);
    }


}
