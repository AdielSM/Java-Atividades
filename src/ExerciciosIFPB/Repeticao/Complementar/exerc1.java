package ExerciciosIFPB.Repeticao.Complementar;

/*
1. Faça um programa que leia um número N, calcule e mostre os N primeiros
termos da sequência de Fibonacci (0, 1, 1, 2, 3, 5, 8, 13, ...). O valor lido para
N sempre será maior ou igual a 2.
 */

import java.util.Scanner;

public class exerc1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int quantidade = in.nextInt();

        int anterior = 0;
        int atual = 1;
        int proximo = 0;

        System.out.print(anterior + " ");
        System.out.print(atual + " ");

        for (int i = 0; i < quantidade - 2; i++) {
            proximo = anterior + atual;
            System.out.print(proximo + " ");
            anterior = atual;
            atual = proximo;
        }

        in.close();
    }
}
