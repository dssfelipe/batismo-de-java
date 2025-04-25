package Desafio2;

import java.util.Scanner;

public class CadastroDeNinjas {
    public static void main(String[] args) {

        // Entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Fazer o Array
        int NUMERO_MAX = 5;
        String[] ninjas = new String[NUMERO_MAX];

        // Contadores
        int ninjasCadastrados = 0;
        int opcao = 0;

        // Variável para deletar ninja cadastrado
        int deletarNinja = -1;

        while(opcao != 4){

            // MENU
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Deletar Ninja cadastrado");
            System.out.println("4. Sair");
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

                    } else {
                        System.out.println("A lista de ninja está cheia, impossível cadastrar um novo ninja");
                    }
                    break;

                case 2:
                    if (ninjasCadastrados == 0){
                        System.out.println("Nenhum ninja foi cadastrado!");
                    } else {
                        System.out.println("Lista de ninjas cadastrados:");
                        for (int i = 0; i < ninjas.length; i++) {
                            if (ninjas[i] == null){
                                continue;
                            } else {
                                System.out.println((i + 1) + ". " + ninjas[i]);
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.println("Digite em qual posição está o ninja que gostaria de deletar (1 a " + ninjasCadastrados + "): ");
                    deletarNinja = scanner.nextInt();
                    scanner.nextLine();

                    if (deletarNinja >= 1 && deletarNinja <= ninjasCadastrados) {
                        // Ajusta o índice (deletarNinja - 1 para indexação no array)
                        deletarNinja--;

                        // Desloca os elementos à esquerda para preencher a posição do ninja deletado
                        for (int i = deletarNinja; i < ninjasCadastrados - 1; i++) {
                            ninjas[i] = ninjas[i + 1];
                        }

                        // A última posição é agora null, pois o último elemento foi movido
                        ninjas[ninjasCadastrados - 1] = null;
                        ninjasCadastrados--; // Decrementa o contador de ninjas cadastrados
                        System.out.println("Ninja deletado com sucesso!");

                    } else {
                        System.out.println("Número de posição inválido!");
                    }
                    break;

                case 4:
                    System.out.println("Estamos encerrando o programa... Aguarde...");
                    break;

                default:
                    System.out.println("Opção incorreta, digite um número de 1 a 4.");
                    break;
            }
        }
    }
}
