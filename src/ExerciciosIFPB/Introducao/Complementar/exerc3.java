package ExerciciosIFPB.Introducao.Complementar;

/*
3. Escreva um programa que leia duas variáveis inteiras e troque o conteúdo entre elas,
mostrando o resultado.
 */

import java.util.Scanner;

public class exerc3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite 2 números inteiros: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int numAuxiliar = num1;
        num1 = num2;
        num2 = numAuxiliar;

        System.out.println("Número 1: " + num1);
        System.out.println("Número 2: " + num2);
    }
}
