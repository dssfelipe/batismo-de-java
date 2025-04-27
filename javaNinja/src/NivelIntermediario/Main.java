package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        //Criar o Ninja - Naruto é um OBJETO
        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 17;
        Naruto.aldeia = "Aldeia da Folha";

        //Criando OBJETO Sasuke
        Ninja Sasuke = new Ninja();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 18;
        Sasuke.aldeia = "Aldeia da Folha";

        Sasuke.SharingaAtivado();
        String ChamandoMetodo = Sasuke.EuSouUmNinja();
        System.out.println(ChamandoMetodo);

        int quantoTempoFalta = Sasuke.anosParaSeTornarHokage(70);
        System.out.println("Voce tem " + Sasuke.idade + " anos, entao falta no minimo " + quantoTempoFalta + " anos para se tornar hokage.");

        //Criando OBJETO Sakura
        Ninja Sakura = new Ninja();
        Sakura.nome = "Sakura Haruno";
        Sakura.idade = 18;
        Sakura.aldeia = "Aldeia da Folha";







    }
}
