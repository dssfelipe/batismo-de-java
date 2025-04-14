package TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        /*
        *Dados Primitivos: int, double, float, char, boolean
        * Objeto da aula: Criar um Ninja - Naruto -
        */

        int idade = 17; // Valor maximo :2147483647
        double altura = 1.64;
        char inicial = 'N';
        boolean vivoOuMorto = true;
        long saldoBancario = 20393489753894L; // Valor maximo: 9.223.372.036.854.775.807L

        System.out.println(idade); // Comando para mostrar para o usuario
        System.out.println(saldoBancario);
        System.out.println(altura);
        System.out.println("saldo bancario = " + saldoBancario);
        System.out.println("minha idade é: " + idade);

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

        // Declarando Ninja Sasuke
        String nome2= "Sasuke";
        String nome2capslok = nome2.toUpperCase();
        System.out.println(nome2);
        System.out.println(nome2.toUpperCase());
    }
}
