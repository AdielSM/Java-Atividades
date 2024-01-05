package ExerciciosIFPB.Introducao.Basico;

import java.util.Scanner;
/*
2. Escreva um programa que leia um número inteiro e exiba o dobro dele.
 */

public class exerc2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = in.nextInt();

        System.out.println("O dobro de " + num + " é igual a " + (num * 2));
    }
}
