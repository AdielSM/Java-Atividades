package ExerciciosIFPB.Array.Complementar;

/*
1. Escreva um programa que leia um vetor contendo N elementos inteiros (N será
lido), calcule e exiba:
• A quantidade de elementos pares;
• A quantidade de elementos ímpares;
• A soma de todos os elementos;
• A média dos elementos do vetor.
 */

public class exerc1 {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int pares = 0, impares = 0, soma = 0;
        double media = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            soma += vetor[i];
        }
        media = (double) soma / vetor.length;

        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Quantidade de impares: " + impares);
        System.out.println("Soma dos elementos: " + soma);
        System.out.println("Média dos elementos: " + media);
    }
}
