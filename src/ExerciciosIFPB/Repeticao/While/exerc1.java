package ExerciciosIFPB.Repeticao.While;

/*
1. Faça um programa que leia 30 números inteiros, calcule e mostre a soma deles
Obs: não use o comando for, use while.
 */

import java.util.Scanner;

public class exerc1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Informe a quantidade de números a serem digitados: ");
        int quantidade = in.nextInt(), i = 1, maior = Integer.MIN_VALUE;

        while(i <= quantidade){
            System.out.print("Digite o número " + i + ": ");
            int numero = in.nextInt();

            maior = Math.max(maior, numero);
            i++;
        }

        System.out.println("O maior número digitado foi: " + maior);

        in.close();
    }
}
