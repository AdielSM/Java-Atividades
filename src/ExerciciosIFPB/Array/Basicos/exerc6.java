package ExerciciosIFPB.Array.Basicos;

/*
6. Escreva um programa que leia um vetor de N números inteiros (N será lido),
inverta a ordem dos elementos do vetor e exiba o vetor invertido.
Ex: V = [1, 3, 5, 7], após a inversão: V = [7, 5, 3, 1].
Obs: É necessário inverter os elementos do vetor, não basta imprimi-los em
ordem inversa!
 */

import java.util.Arrays;

public class exerc6 {
    public static void main(String[] args) {
        int[] vetor = {1,3,5,7,9};

        for(int i = 0; i < vetor.length / 2; i++){
            int temp = vetor[i];
            vetor[i] = vetor[vetor.length - i - 1];
            vetor[vetor.length - i - 1] = temp;
        }

        System.out.println(Arrays.toString(vetor));
    }
}
