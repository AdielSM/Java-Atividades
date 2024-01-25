package ExerciciosIFPB.Strings.Basico;

import java.util.Scanner;

/*
2. Faça um programa que leia uma frase e a exiba sem os espaços em branco.
 */
public class exerc2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = in.nextLine();
        frase = frase.replace(" ", "");

        System.out.println(frase);
        in.close();
    }
}
