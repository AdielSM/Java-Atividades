package ExerciciosIFPB.Repeticao.For;

/*
5. Faça um programa que, para um grupo de N pessoas (obs: N será lido):
• Leia o sexo (M ou F) de cada pessoa;
• Calcule e escreva o percentual de homens;
• Calcule e escreva o percentual de mulheres.
 */

import java.util.Scanner;

public class exerc5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Digite a quantidade de pessoas do grupo: ");
        int pessoas = in.nextInt(), quantidadeHomens = 0, quantidadeMulheres = 0, quantidadePessoas = 0;

        for(int i = 1; i <= pessoas; i++) {
            System.out.print("Digite o sexo da pessoa " + i + " (M/F): ");
            char sexo = in.next().toUpperCase().charAt(0);

            if (sexo == 'M'){
                quantidadeHomens++;
            } else {
                quantidadeMulheres++;
            }

            quantidadePessoas++;
        }

        double percentHomens = (double) quantidadeHomens/quantidadePessoas * 100,
                percentMulheres = (double) quantidadeMulheres/quantidadePessoas * 100;

        System.out.println("Percentual de homens: " + percentHomens);
        System.out.println("Percentual de mulheres: " + percentMulheres);
    }
}
