package Condicoes;

import javax.xml.transform.Source;
import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        /*
         * Scanner = È um jeito de trazer o usuario para dentro da aplicacao.
         * Objeto: O usuario vai criar um ninja e vamos validar os dados
         */

        // Abrir op Scanner
        Scanner caixaDeTexto = new Scanner(System.in);

        System.out.print("Escreva aqui o nome do ninja: ");
        String nomeDoNinja = caixaDeTexto.nextLine();


        System.out.println("O nome do ninja é: " + nomeDoNinja);

        //novo scanner

        Scanner caixaDeIdade = new Scanner(System.in);

        System.out.println("Digite a sua idade, jovem ninja: ");
        int idadeNinja = caixaDeIdade.nextInt();

        System.out.println("A sua idade é: " + idadeNinja);

        // Tratamento de dados

        if(idadeNinja >= 18){
            System.out.println("Vocé já e de maior, e poderá fazer missoes fora da vila!");
        }else{
            System.out.println("Você é um ninja muito novo ainda, treine mais antes de sair da vila");
        }

        // Fechar sempre o scanner
        caixaDeTexto.close();
        caixaDeIdade.close();

    }




}

