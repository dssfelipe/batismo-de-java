package ClassesAbstratasEInterfaces;

public abstract class Ninja {

    String nome;
    String aldeia;
    int idade;


    public void nomeDoNinja(){
        System.out.println("Meu nome é: " + nome);
    }

    //Métodos abstratos
    public abstract void idadeDoNinja();
}
