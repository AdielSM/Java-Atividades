package ExerciciosIFPB.Strings.Complementar;

/*
5. Faça um programa que leia uma frase e a exiba na tela conforme o exemplo abaixo.
Exemplo:
Entrada: ABCDE
Saída:
A
BB
CCC
DDDD
EEEEEE
DDDD
CCC
BB
A
 */

import java.util.Scanner;

public class exerc5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String palavra = in.nextLine();

        int palavraLength = palavra.length();
        for(int i = 0; i < palavraLength; i++){
            System.out.println(String.valueOf(palavra.charAt(i)).repeat(i+1));
        }

        for (int i = palavraLength - 2; i >= 0; i--) {
            System.out.println(String.valueOf(palavra.charAt(i)).repeat(i+1));
        }
    }
}
