package Construtores;

public abstract class Hokage {

    String nome;
    int idade;
    boolean vivoOuNao;
    String audeia;
    int missoes;
    double saldoBancario;
    double altura;

    public abstract void sabedoriaHokage();

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
    public Hokage(String nome, int idade, boolean vivoOuNao, String audeia, int missoes, double saldoBancario, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
        this.audeia = audeia;
        this.missoes = missoes;
        this.saldoBancario = saldoBancario;
        this.altura = altura;
    }
}
