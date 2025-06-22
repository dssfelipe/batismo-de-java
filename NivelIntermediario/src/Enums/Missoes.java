package Enums;

public class Missoes {
    private String nome;
    private RankDeMissoes rank;

    // Metodo para mostrar mais informaçoes
    public void exibirDetalhes() {
        System.out.println("Missão: " + nome + " - Rank: " + rank + " (Descrição: " + rank.getDescricao() + ", Dificuldade: " + rank.getDificuldade() + ")");
    }

    public Missoes(String nome, RankDeMissoes rank) {
        this.nome = nome;
        this.rank = rank;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Enums.RankDeMissoes getRank() {
        return rank;
    }

    public void setRank(Enums.RankDeMissoes rank) {
        this.rank = rank;
    }
}
