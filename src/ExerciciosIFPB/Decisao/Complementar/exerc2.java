package ExerciciosIFPB.Decisao.Complementar;

/*
2. Escreva um programa que solicite a digitação de um caractere qualquer do teclado e imprima
sua classificação: vogal, consoante, número e caractere especial.
 */

import java.util.Scanner;

public class exerc2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um caracter qualquer: ");
        char input = in.next().toLowerCase().charAt(0);

        if (Character.isLetter(input)){
            if (isVogal(input)){
                System.out.println("É vogal.");
            } else{
                System.out.println("É consoante.");
            }
        }
        else if (Character.isDigit(input)){
            System.out.println("É um número.");
        }
        else{
            System.out.println("É um caractere especial.");
        }

        in.close();
    }
    public static boolean isVogal(char caractere){
        char[] vogais = {'a','e','i','o','u'};
        for (char vogal : vogais){
            if (caractere == vogal){
                return true;
            }
        }
        return false;
    }
}
