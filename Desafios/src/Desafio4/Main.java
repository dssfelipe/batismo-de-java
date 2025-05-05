package Desafio4;

public class Main {
    public static void main(String[] args) {

        //Ninja Rock Lee
        NinjaBasico ninjaBasico = new NinjaBasico();
        NinjaBasico RockLee = new NinjaBasico("Rock Lee", 15, "Tayjutsu");
        RockLee.showInfo();
        RockLee.runSkills();

        //Ninja Jiraya
        NinjaAvancado ninjaAvancado = new NinjaAvancado();
        NinjaAvancado Jiraya = new NinjaAvancado("Jiraya", 43, "Ninjutsu", "Técnica de Invocação");
        Jiraya.showInfo();
        Jiraya.runSkills();


    }
}
