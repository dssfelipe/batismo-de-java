package Desafio4;

public class NinjaBasico implements Ninja{

    String name;
    int age;
    String skills;

    public NinjaBasico() {
    }

    public NinjaBasico(String name, int age, String skills) {
        this.name = name;
        this.age = age;
        this.skills = skills;
    }

    @Override
    public void showInfo() {
        System.out.println("\nNome: " + name);
        System.out.println("Idade: " + age);
        System.out.println("Habilidade: " + skills);
    }

    @Override
    public void runSkills() {
        System.out.println(name + " Não tem habilidade especial!");
    }
}
