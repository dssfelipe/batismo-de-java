package Desafio3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Uchiha Sasuke = new Uchiha();
        //Atributos do Ninja
        Sasuke.name = "Sasuke Uchiha";
        Sasuke.village = "Vila da Folha";
        Sasuke.mission = "Resgatar ninja sequestrado";
        Sasuke.difficultyLevel = "Difícil";
        Sasuke.statusMission = "Concluído";
        Sasuke.age = 18;

        Sasuke.showInfo();

    }


}
