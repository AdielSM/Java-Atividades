package ExerciciosIFPB.Decisao.Complementar;

/*
3. Escreva um programa que solicite a digitação de um ano e imprima sua classificação como
bissexto ou não bissexto.
Obs: um ano é bissexto se for divisível por 4, mas não por 100. Um ano também é bissexto se
for divisível por 400.
 */

import java.util.Scanner;

public class exerc3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        long ano = in.nextLong();

        if (eBissexto(ano)){
            System.out.println("Ano bissexto.");
        } else {
            System.out.println("Ano não bissexto");
        }

        in.close();
    }

    public static boolean eBissexto(long ano){
        if (ano % 400 == 0){
            return true;
        } else return ano % 4 == 0 && ano % 100 != 0;
    }
}
