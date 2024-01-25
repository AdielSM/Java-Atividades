package ExerciciosIFPB.Strings.Complementar;

import java.util.Scanner;

/*
2. Faça um programa que leia uma frase e a exiba criptografada. O método de criptografia será
baseado na seguinte regra: trocar alguns caracteres por outros, conforme a tabela abaixo:

CARACTER ORIGINAL     CARACTER CRIPTOGRAFADO
      A                       branco
      E                         U
      I                         O
      O                         I
      U                         E
      branco                    A
Exemplo: "BOA NOITE" criptografado fica "BI ANIOTU"
 */
public class exerc2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder saida = new StringBuilder();

        System.out.print("Digite uma palavra: ");
        String entrada = in.nextLine().toUpperCase();

        for (int i = 0; i < entrada.length(); i++) {
            saida.append(
                    switch (entrada.charAt(i)){
                        case 'A' -> " ";
                        case 'E' -> "U";
                        case 'I' -> "O";
                        case 'O' -> "I";
                        case 'U' -> "E";
                        case ' ' -> "A";
                        default -> entrada.charAt(i);
                    }
            );
        }
        in.close();
        System.out.println(saida);
    }
}
