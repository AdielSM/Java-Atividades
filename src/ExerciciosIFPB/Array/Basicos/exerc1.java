package ExerciciosIFPB.Array.Basicos;

/*
1. Escreva um programa que leia um vetor A de N números inteiros (N será lido) e
um outro inteiro K, construa e exiba um outro vetor B cujos elementos são os
respectivos elementos de a multiplicados por K.
Ex: A = [1,2,3], K = 5, B = [5,10,15].
 */

import java.util.Arrays;
import java.util.Scanner;

public class exerc1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Diga quantos números serão digitados: ");
        int quant = in.nextInt();

        System.out.print("Digite o número fator: ");
        int fator = in.nextInt();

        int[] array = lerInteiros(in, quant);
        System.out.println("A = " + Arrays.toString(array));
        System.out.println("K = " + fator);

        array = multiplicarArray(array, fator);
        System.out.println("B = " + Arrays.toString(array));


    }

    public static int[] multiplicarArray(int[] array, int fator){
        for (int i = 0; i < array.length; i++){
            array[i] *= fator;
        }
        return array;
    }

    public static int[] lerInteiros(Scanner scanner, int len){
        int[] array = new int[len];
        for(int i = 0; i < len; i++){
            array[i] = scanner.nextInt();
        }

        return array;
    }
}
