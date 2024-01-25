package ExerciciosIFPB.Strings.Basico;

/*
1. Faça um programa que leia uma frase e determine a quantidade de brancos
contidos na mesma.
 */

import java.util.Scanner;

public class exerc1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = in.nextLine();

        int blankSpaces = 0;
        for(int i = 0; i < frase.length(); i++){
            if (frase.charAt(i) == ' '){
                blankSpaces++;
            }
        }

        System.out.printf("Há %d espaços em brancos na frase.",blankSpaces);
        in.close();
    }
}
