package ExerciciosIFPB.Introducao.Basico;

import java.util.Scanner;

/*
3. Faça um programa que leia dois números reais, calcule e exiba a soma deles.
 */

public class exerc3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número real: ");
        double num1 = in.nextDouble();

        System.out.print("Digite outnoro número real: ");
        double num2 = in.nextDouble();

        System.out.println("A soma de " + num1 + " + " + num2 + " é " + (num1 + num2));
    }
}
