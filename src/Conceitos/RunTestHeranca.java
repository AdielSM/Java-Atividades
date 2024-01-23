package Conceitos;

import Conceitos.Heranca.Cachorro;
import Conceitos.Heranca.Gato;

public class RunTestHeranca {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", 5, "Au Au");
        System.out.println(cachorro.comerOsso());
        System.out.println(cachorro.getQuantidadeDeOssos());
        cachorro.emitirSom();
        cachorro.comer();
        cachorro.dormir();
        System.out.println(cachorro);

        System.out.println("_ _ _ _ _ _ _ _ _");

        Gato gato = new Gato("Felix", 3, "Miau");
        System.out.println(gato.beberLeite());
        gato.emitirSom();
        gato.comer();
        gato.dormir();
        System.out.println(gato);

    }
}
