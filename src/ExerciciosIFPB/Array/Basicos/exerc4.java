package ExerciciosIFPB.Array.Basicos;

/*
4. Escreva um programa que leia 10 números e armazene-os em um vetor. Exiba:
• Os números que estão nos índices pares;
• Os números que estão nos índices ímpares.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class exerc4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] array = lerInteiros(in, 10);

        ArrayList<Integer> listaPar = new ArrayList<>();
        ArrayList<Integer> listaImpar = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0){
                listaPar.add(array[i]);
            } else{
                listaImpar.add(array[i]);
            }
        }

        System.out.println("Números em índices pares: ");
        System.out.println(listaPar);
        System.out.println("Números em índices ímpares: ");
        System.out.println(listaImpar);

    }

    public static int[] lerInteiros (Scanner scanner, int len){
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        return array;
    }
}
