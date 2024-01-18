package ExerciciosIFPB.Repeticao.Complementar;

/*
4. Um dado material radioativo perde metade de sua massa a cada 50
segundos. Faça um programa que leia uma certa quantidade de massa, em
gramas, deste material e imprima o tempo necessário para que sua massa
se torne menor que 0.5g.
 */

import java.util.Scanner;

public class exerc4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite a massa do produto em gramas: ");
        int gramas = in.nextInt(),
            segundos = 0;

        while (gramas > 0.5){
            segundos += 50;
            gramas /= 2;
        }

        System.out.println("São necessários " + segundos + " segundos.");

        in.close();
    }
}
