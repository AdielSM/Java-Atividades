package ExerciciosIFPB.Introducao.Complementar;

/*
2. Escreva um programa para calcular e exibir a média ponderada de 2 notas dadas. Sabe-
se que nota1 possui peso 6 e nota2 possui peso 4.
 */

import java.util.Scanner;

public class exerc2 {
    public static void main(String[] args) {
        int NOTA1_PESO = 6;
        int NOTA2_PESO = 4;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a primeira e a segunda nota do aluno: ");

        double nota1 = in.nextDouble();
        double nota2 = in.nextDouble();

        double media = (nota1 * NOTA1_PESO + nota2 * NOTA2_PESO) / (NOTA1_PESO + NOTA2_PESO);

        System.out.println("A média do aluno é " + media);
    }
}
