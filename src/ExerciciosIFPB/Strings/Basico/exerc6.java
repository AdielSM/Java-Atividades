package ExerciciosIFPB.Strings.Basico;

import java.util.Scanner;

/*
6. Faça um programa que leia uma frase e a exiba invertida.
 */
public class exerc6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = in.nextLine();

        StringBuilder str = new StringBuilder(frase);
        System.out.println(str.reverse());
    }
}
