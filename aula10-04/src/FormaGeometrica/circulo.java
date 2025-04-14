package FormaGeometrica;

public class circulo extends Formas{
    double raio;

    public circulo(double raio) {
        this.raio = raio;
    }

    public double calculoPerimetro(){
        return 2 * Math.PI * raio;
    }
}

