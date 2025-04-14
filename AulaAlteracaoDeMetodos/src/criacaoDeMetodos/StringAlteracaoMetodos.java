package criacaoDeMetodos;

public class StringAlteracaoMetodos {
    public static void main(String[] args) {
    // Tudo que for digitado aqui dentro com o comando vai ser compilado pelo java

        /* Dados nao primitivos: String, Array, Class, Enum
         * Objetivo: Criar um ninja, e atribuir metodos a ele.
         * */

        // Declarando a variavel como NARUTO UZUMAKI
        String nome = "Naruto Uzumaki";
        String NomeToUppercase = "NARUTO UZUMAKI"; // Nome em caixa alta: ToUppercase vai colocar tudop em CAPSLOCK
        String NomeLowercase = "naruto usuzaki"; // Nome em caixa baixa: Lowercase vai coloar tudo em caixa baixa
        System.out.println("Esse texto esta em CAPSLOCK: " + NomeToUppercase);
        System.out.println("Esse texto esta normal: " + nome);
        System.out.println("Esse texto esta em caixa baixa: " + NomeLowercase);

        String aldeia = "Aldeia da folha";
        String AldeiaEmCaixaBaixa = aldeia.toLowerCase(); //Tolowercase vai coloar tudo em caixa baixa
        System.out.println(AldeiaEmCaixaBaixa);


        // characteristics = caracteristicas


    }

}
