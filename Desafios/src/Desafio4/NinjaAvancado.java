package Desafio4;

public class NinjaAvancado implements Ninja{

    String name;
    int age;
    String skills; /*Habilidades*/
    String specialty; /*especialidade*/;



    @Override
    public void showInfo() {
        System.out.println("\nNome: " + name);
        System.out.println("Idade: " + age);
        System.out.println("Habilidade: " + skills);
        System.out.println("Especialidade: " + specialty);
    }

    @Override
    public void runSkills() {
        System.out.println(name + " Ativou a sua especialidade: " + specialty);
    }

    public NinjaAvancado(String name, int age, String skills, String specialty) {
        this.name = name;
        this.age = age;
        this.skills = skills;
        this.specialty = specialty;
    }

    public NinjaAvancado() {
    }
}
