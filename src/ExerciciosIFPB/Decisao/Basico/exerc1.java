package ExerciciosIFPB.Decisao.Basico;

import java.util.Scanner;

/*
1. Escreva um programa que leia um número inteiro e determine se ele é par ou ímpar.
 */

public class exerc1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        long num = in.nextLong();

        if (testePar(num)){
            System.out.println("O número é par!");
        } else {
            System.out.println("O número é ímpar!");
        }

    }
    public static boolean testePar(long num){
        return num % 2 == 0;
    }
}
