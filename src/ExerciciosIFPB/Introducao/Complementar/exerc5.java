package ExerciciosIFPB.Introducao.Complementar;

import java.util.Scanner;

/*
5. Escreva um programa que, dado um número inteiro representando uma quantidade de
segundos, calcule quantas horas, minutos e segundos estão contidos nesta quantidade.
Ex: 7.388 segundos = 2 horas, 3 minutos e 8 segundos.
 */
public class exerc5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor, horas, minutos, segundos;

        System.out.print("Digite um valor em segundos: ");
        valor = in.nextInt();

        horas = valor / 3600;
        valor %= 3600;
        minutos = valor / 60;
        valor %= 60;
        segundos = valor;

        System.out.println(horas + " hora(s), " + minutos + " minuto(s) e " + segundos + " segundo(s)");
    }
}
