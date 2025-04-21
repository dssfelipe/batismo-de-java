package Desafio2;

import java.util.Scanner;

public class CadastroDeNinjas {
    public static void main(String[] args) {

        // Array para armazenar os nomes dos ninjas cadastrados
        String[] nomeDosNinjas = new String[5];

        int menu = -1; // Variável usada para armazenar a opção escolhida no menu
        int contador = 0;

        while (menu != 3){

            //Exibe o menu de opções para o usuário
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            // Cria o Scanner para ler as entradas do usuário
            Scanner scanner = new Scanner(System.in); //Cria o Scanner para ler as entradas do usuário


            if (scanner.hasNextInt()) {
                menu = scanner.nextInt();
                scanner.nextLine(); // limpa quebra de linha
            } else {
                System.out.println("Por favor, digite apenas números.");
                scanner.nextLine(); // consome o que foi digitado errado
                continue; // volta para o início do loop
            }




                // Executa a ação de acordo com a opção escolhida pelo usuário
                switch (menu) {
                    case 1:

                        if (contador < nomeDosNinjas.length) {

                            System.out.println("Digite o nome do Ninja: ");
                            String novoNome = scanner.nextLine();
                            nomeDosNinjas[contador] = novoNome;
                            contador++;

                        }else {
                            System.out.println("Limete de Ninjas atingido.");
                        }

                        break;

                    case 2:

                        if (contador == 0) {
                            System.out.println("Nenhum ninja cadastrado ainda.");
                        } else {
                            for (int i = 0; i < contador; i++) {
                                System.out.println((i + 1) + ". " + nomeDosNinjas[i]);
                            }
                        }

                        break;

                    case 3:

                        System.out.println("Obrigado por escolher nossa vila!");
                        break;

                }

        }
    }
}
