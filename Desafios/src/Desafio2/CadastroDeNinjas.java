package Desafio2;

import java.util.Scanner;

public class CadastroDeNinjas {
    public static void main(String[] args) {

        //Entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Fazer o Array
        int NUMERO_MAX = 5;
        String[] ninjas = new String[NUMERO_MAX];

        // Contadores
        int ninjasCadastrados = 0;
        int opcao = 0;

        boolean executando = true;

        while(opcao != 3){

         // MENU
        System.out.println("\n===== Menu Ninja =====");
        System.out.println("1. Cadastrar Ninja");
        System.out.println("2. Listar Ninjas");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
        opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao){
            case 1:
            if (ninjasCadastrados < NUMERO_MAX){
                System.out.println("Digite o nome do ninja para cadastro: ");
                String nomeNinja = scanner.nextLine();
                ninjas[ninjasCadastrados] = nomeNinja;
                ninjasCadastrados++;
                System.out.println("Ninja cadastrado com sucesso!");

                }else {
                System.out.println("A lista de ninja esta cheia, impossivel cadastrar um novo ninja");
            }
                break;

            case 2:
                if (ninjasCadastrados == 0){
                    System.out.println("Nenhum ninja foi cadastrado!");
                }else {
                    System.out.println("Lista de ninjas cadastrados.");
                    for (int i = 0; i < ninjas.length; i++) {
                        if (ninjas[i] == null){
                            continue;
                        }else {
                            System.out.println((1 + i) + ". " + ninjas[i]);
                        }
                    }
                }
                break;

            case 3:
                System.out.println("Estamos encerrando o programa... Aguarde...");
                break;

            default:
                System.out.println("Opcao incorreta, digite um numero de 1 a 3.");
                break;
        }
        }
    }
}
