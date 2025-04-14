package FormaGeometrica;

public class quadrado extends Formas{
    double lado;

    public quadrado(double lado){
        this.lado = lado;
    }

    public double calcularPerimetro(){
        return 4 * lado;
    }

}

