package ExerciciosIFPB.Repeticao.Complementar;

/*
5. Faça um programa que, leia a temperatura dos 30 dias do mês de abril diga
qual o dia mais quente e o dia mais frio do mês (obs: suponha que não haja
empates).
 */

import java.util.Scanner;

public class exerc5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int diaMaisQuente = Integer.MIN_VALUE,
            diaMaisFrio = Integer.MAX_VALUE;

        for (int i = 0; i < 30; i++) {
            System.out.print("Digite a temperatura do dia " + (i + 1) + ": ");
            int temperatura = in.nextInt();

            diaMaisQuente = Math.max(diaMaisQuente, temperatura);
            diaMaisFrio = Math.min(diaMaisFrio, temperatura);
        }

        System.out.println("O dia mais quente foi o dia " + diaMaisQuente + " °C.");
        System.out.println("O dia mais frio foi o dia " + diaMaisFrio + " °C.");
    }
}
