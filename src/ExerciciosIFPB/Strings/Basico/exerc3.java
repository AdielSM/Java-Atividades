package ExerciciosIFPB.Strings.Basico;

import java.util.Scanner;

/*
3. Faça um programa que leia uma frase e a exiba toda em letras maiúsculas.
 */
public class exerc3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = in.nextLine();

        System.out.println(frase.toUpperCase());
        in.close();
    }
}
