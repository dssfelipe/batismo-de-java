package SobrecargaDeConstrutores;

public class Kanai {

    private String nome;

    public void Kunai(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Kunai: " + nome;
    }
}
