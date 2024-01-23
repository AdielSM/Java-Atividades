package Conceitos.Heranca;

public class Animais {
    protected String nome;
    protected int idade;
    protected String som;

    public Animais(String nome, int idade, String som) {
        this.nome = nome;
        this.idade = idade;
        this.som = som;
    }

    public void emitirSom() {
        System.out.println(this.som);
    }

    public void comer() {
        String saida = String.format("O %s está comendo...", this.nome);
        System.out.println(saida);
    }

    public void dormir() {
        String saida = String.format("O %s está dormindo...", this.nome);
        System.out.println(saida);
    }

    public void mover() {
        String saida = String.format("O %s está se movendo...", this.nome);
        System.out.println(saida);
    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", som='" + som + '\'';
    }
}
