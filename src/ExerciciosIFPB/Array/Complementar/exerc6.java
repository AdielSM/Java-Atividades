package ExerciciosIFPB.Array.Complementar;

/*
6. O Brasil possui 26 estados e 1 distrito federal, totalizando 27 unidades
federativas. Escreva um programa para armazene, em um vetor, a sigla de todas
as unidades federativas. O programa deverá obter de vários usuários qual é a
unidade federativa ele acha mais interessante, informando a respectiva sigla. O
programa encerra quando for digitada uma sigla inexistente. Ao final, o
programa deverá exibir qual foi a sigla mais votada (considere possibilidade de
empate).
 */

import java.util.Scanner;

public class exerc6 {
public static void main(String[] args) {
        String[] siglas = {"AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO",
                "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN",
                "RS", "RO", "RR", "SC", "SP", "SE", "TO"};

        int[] votos = new int[siglas.length];
        int maior = 0;
        String maisVotado = "";
        boolean existe = false;

        do {
            existe = false;
            System.out.println("Digite a sigla do estado que você acha mais interessante: ");
            String sigla = new Scanner(System.in).nextLine().toUpperCase();

            for (int i = 0; i < siglas.length; i++) {
                if (sigla.equals(siglas[i])) {
                    votos[i]++;
                    existe = true;
                }
            }

            if (!existe) {
                System.out.println("Sigla inexistente!");
            }

        } while (existe);

        for (int i = 0; i < votos.length; i++) {
            if (votos[i] > maior) {
                maior = votos[i];
                maisVotado = siglas[i];
            }
        }

        System.out.println("A sigla mais votada foi " + maisVotado + " com " + maior + " votos.");
    }
}
