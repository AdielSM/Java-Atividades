package ExerciciosIFPB.Repeticao.For;

import java.util.Scanner;

/*
4. Faça um programa que leia n números inteiros, determine e mostre o maior
deles.
 */
public class exerc4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite a quantidade de números a serem digitados: ");
        int quantidade = in.nextInt();
        long maior = Long.MIN_VALUE;

        for(int i = 1; i <= quantidade; i++){
            System.out.print("Número " + i + ": ");
            long numero = in.nextLong();

            maior = Math.max(numero, maior);
        }

        System.out.println("O maior número digitado foi: " + maior);

        in.close();
    }
}
