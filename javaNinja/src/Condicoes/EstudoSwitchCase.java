package Condicoes;

import java.util.Scanner;

public class EstudoSwitchCase {
    public static void main(String[] args) {

        /*
        * SwitchCases: Quer servem para gerar casos especificos
        * Objetivo: Pedor pro usuario escoljer entre os Ninjas
        * switchCase
        * */


        // Pedir para o usuario
        Scanner scanner = new Scanner(System.in);

        // Mostrar opcoes para o usuario
        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto Uzumack");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        // Pedir para o usuario escolher uma das opcoes
        int escolhaDoUsuario = scanner.nextInt();

        System.out.println("Você digitou o numero: " + escolhaDoUsuario);

        // Reacao ao escolher um personagem

        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("O usuario escolheu o Naruto Uzumaki, o proximo Hokage");
                break;
            case 2:
                System.out.println("O usuario escolheu o Sasuke Uchiha, o ninja mais revoltado");
                break;
            case 3:
                System.out.println("O usuario escolheu a Sakura Haruno1");
                break;
            default:
                System.out.println("Você nao digitou uma resposta valida! Tente denovo");
        }





        // Fechar a caixa
        scanner.close();
    }
}
