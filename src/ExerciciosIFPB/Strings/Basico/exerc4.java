package ExerciciosIFPB.Strings.Basico;

/*
4. Faça um programa que leia uma frase e a exiba com a inicial de cada palavra em
maiúsculo.
 */

import java.util.Scanner;

public class exerc4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = in.nextLine();

        System.out.println(toTitleCase(frase));
        in.close();
    }

    public static StringBuilder toTitleCase(String palavra){
        StringBuilder titleCase = new StringBuilder();
        boolean nextTitleCase = true;

        for (char c : palavra.toCharArray()) {
            if (Character.isSpaceChar(c)) {
                nextTitleCase = true;
            } else if (nextTitleCase) {
                c = Character.toTitleCase(c);
                nextTitleCase = false;
            }

            titleCase.append(c);
        }

        return titleCase;
    }
}
