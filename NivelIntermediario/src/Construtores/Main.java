package Construtores;

public class Main {

    public static void main(String[] args) {

        Hokage Hashirama = new Hokage();
        Hashirama.idade = 45;

        Hokage Tobirama = new Hokage("Tobirama Senju");
        System.out.println(Tobirama.nome);

        Hokage Hiruzen = new Hokage(40);
        System.out.println(Hiruzen.idade);

        Hokage Minato = new Hokage("Minato Namikaze", 32, false);
        System.out.println(Minato.nome + Minato.idade + Minato.vivoOuNao);

        Hokage Tsunade = new Hokage();

    }

}
