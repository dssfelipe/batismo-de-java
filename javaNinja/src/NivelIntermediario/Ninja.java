package NivelIntermediario;

public class Ninja {

    String nome;
    int idade;
    String aldeia;

/*//    Criar um metodo publico personalizado
    public void SharingaAtivado() {
        System.out.println("Sharinga Ativado!");
    }*/

//    Metodo String vai ter que retornar um String
    public String EuSouUmNinja(){
        return "Oi, Eu sou um Ninja!";
    }

//    Metodo Int vai ter que retornar um int
    public int anosParaSeTornarHokage(int idadeMinimaParaSerHokage){
        return idadeMinimaParaSerHokage - idade;
    }

}
