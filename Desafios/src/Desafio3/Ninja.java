package Desafio3;

public class Ninja {

    String name;
    String village; /*aldeia*/
    String mission; /*missao*/
    String difficultyLevel; /*nivelDeDificuldade*/;
    String statusMission;
    int age;

    public void showInfo(){ /*Mostrar informacoes*/

        System.out.println("Nome: " + name);
        System.out.println("Idade: " + age);
        System.out.println("Vila: " + village);
        System.out.println("Missão: " + mission);
        System.out.println("Nível da Missão: " + difficultyLevel);
        System.out.println("Status da Missão: " + statusMission);

    }
}
