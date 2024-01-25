package ExerciciosIFPB.Strings.Basico;

/*
5. Faça um programa que leia uma frase e a exiba com uma letra em cada linha.
 */

import java.util.Scanner;

public class exerc5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = in.nextLine();

        for (char c : frase.toCharArray()) {
            System.out.println(c);
        }

        in.close();
    }
}
