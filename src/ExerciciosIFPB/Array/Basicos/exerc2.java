package ExerciciosIFPB.Array.Basicos;

/*
2. Escreva um programa que leia um vetor V (contendo 8 inteiros) e um valor
inteiro K, calcule e exiba a quantidade de ocorrências de K dentro de V.
 */

import java.util.Scanner;

public class exerc2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o valor a ser contado no vetor: ");
        int element = in.nextInt();

        int[] array = lerInteiros(in, 8);
        int count = contarOcorrencias(array, element);

        System.out.printf("O valor %d aparece %d vezes no array." ,element, count);
    }

    public static int contarOcorrencias(int[] array, int valor) {
        int contagem = 0;
        for (int j : array) {
            if (j == valor) {
                contagem++;
            }
        }
        return contagem;
    }

    public static int[] lerInteiros(Scanner scanner, int len){
        int[] array = new int[len];
        for(int i = 0; i < len; i++){
            array[i] = scanner.nextInt();
        }

        return array;
    }
}
