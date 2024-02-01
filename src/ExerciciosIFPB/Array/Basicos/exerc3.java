package ExerciciosIFPB.Array.Basicos;

import java.util.Scanner;

/*
3. Escreva um programa que leia um vetor V contendo N elementos inteiros (N será
lido) e um valor inteiro K, verifique e exiba se o K está ou não no vetor. Se estiver,
informe em que posição (índice).
Obs: K pode se repetir no vetor, nesse caso, mostre todas as posições onde o K
aparece.
 */
public class exerc3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o número de elementos no vetor:");
        int N = in.nextInt();

        int[] vetor = lerInteiros(in, N);

        System.out.print("Digite o valor de K:");
        int K = in.nextInt();

        verificarOcorrencias(vetor, K);
    }

    public static void verificarOcorrencias(int[] V, int K) {
        boolean found = false;
        System.out.println("Posições onde K aparece:");
        for (int i = 0; i < V.length; i++) {
            if (V[i] == K) {
                System.out.println(i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("K não está no vetor.");
        }

    }

        public static int[] lerInteiros (Scanner scanner,int len){
            int[] array = new int[len];
            for (int i = 0; i < len; i++) {
                System.out.print("Digite o elemento " + (i + 1) + ": ");
                array[i] = scanner.nextInt();
            }

            return array;
        }
}
