package Conceitos.Heranca;

public class Cachorro extends  Animais{

    int quantidadeDeOssos = 0;

    public Cachorro(String nome, int idade, String som) {
        super(nome, idade, som);
    }

    public String comerOsso(){
        quantidadeDeOssos++;
        return String.format("O %s está comendo um osso!", super.nome);
    }

    public int getQuantidadeDeOssos() {
        return quantidadeDeOssos;
    }
}
