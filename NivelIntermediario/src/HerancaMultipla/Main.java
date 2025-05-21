package HerancaMultipla;

public class Main {
    public static void main(String[] args) {

        //Obj Uchiha
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 17;
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.shariganAtivado();
        System.out.println();


        //Obj Hatake
        Hatake Kakashi = new Hatake();
        Kakashi.nome = "Kakashi Hatake";
        Kakashi.idade = 27;
        Kakashi.aldeia = "Aldeia da Folha";
        Kakashi.boasVindas();
        Kakashi.shariganAtivado();
        Kakashi.ninjaDeElite();
        Kakashi.hokageAtivo();


    }
}
