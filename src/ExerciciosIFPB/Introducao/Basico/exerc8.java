package ExerciciosIFPB.Introducao.Basico;

/*
8. Faça um programa que leia o nome de um aluno e as notas das três provas que ele
obteve no semestre. No final informar o nome do aluno e a sua média (aritmética).
 */

import java.util.Scanner;

public class exerc8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o nome do aluno e suas 3 notas: ");
        String nome = in.next();
        double nota1 = in.nextDouble();
        double nota2 = in.nextDouble();
        double nota3 = in.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média do aluno " + nome + "é " + media);
    }
}
