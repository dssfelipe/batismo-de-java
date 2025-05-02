package Desafio3;

public class Uchiha extends Ninja{

    String specialAbility = "Sharingan!"; /*habilidadeSpecial*/

    public void showAbilitySpecial(){ /*Mostrar habilidade especial*/

        System.out.println(specialAbility);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.printf("Habilidade Especial: ");
        showAbilitySpecial();
    }
}
