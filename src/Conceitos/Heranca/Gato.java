package Conceitos.Heranca;


public class Gato extends Animais{
        public Gato(String nome, int idade, String som) {
            super(nome, idade, som);
        }

        public String beberLeite(){
            return String.format("O %s está bebendo leite!", super.nome);
        }

        @Override
        public void dormir() {
            String saida = String.format("O %s está dormindo muito, afinal ele é um gato...", this.nome);
            System.out.println(saida);
        }

}
