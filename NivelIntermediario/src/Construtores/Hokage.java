package Construtores;

public class Hokage {

    String nome;
    int idade;
    boolean vivoOuNao;
    int altura;
    double saldoBancario;

    public Hokage() {
        //Construtor sem nada - no args

    }

    //Criar um construtor com argumentos
    public Hokage(String nome){
        this.nome = nome;
    }

    public Hokage(int idade) {
        this.idade = idade;
    }

    //Construtor com todos os argumentos - All args contructor
    public Hokage(String nome, int idade, boolean vivoOuNao){
        this.idade = idade;
        this.nome = nome;
        this.vivoOuNao = vivoOuNao;
    }


    //Criando construtores automaticamente com Crtl + N
    public Hokage(String nome, int idade, boolean vivoOuNao, int altura, double saldoBancario) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
        this.altura = altura;
        this.saldoBancario = saldoBancario;
    }
}
