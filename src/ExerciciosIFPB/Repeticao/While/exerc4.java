package ExerciciosIFPB.Repeticao.While;

/*
4. Faça um programa que leia os seguintes dados de um conjunto de alunos:
matrícula, nome e as duas notas que ele obteve em suas avaliações. A
condição de parada será a digitação de uma matrícula igual 0 (zero). O
programa deverá mostrar, para cada aluno, as seguintes informações:
matrícula, nome, média e situação (aprovado, se a média for igual ou superior
a 7 e, reprovado, se a média for inferior a 7).
 */

import java.util.Scanner;

public class exerc4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true){
            System.out.print("Digite a matrícula: ");
            String matricula = in.next();

            if (matricula.equals("0")){
                break;
            }

            in.nextLine();

            System.out.print("Digite o nome: ");
            String nome = in.nextLine();

            System.out.println("Digite as 2 notas: ");
            double nota1 = in.nextDouble(), nota2 = in.nextDouble()
                    ,media = (nota1 + nota2) / 2;

            in.nextLine();

            String situacao = media >= 7 ? "Aprovado" : "Reprovado";

            System.out.println("Matrícula: " + matricula +
                                "\nNome: " + nome +
                                "\nMédia: " + media +
                                "\nSituação: " + situacao + "\n");

        }

        System.out.println("Programa finalizado! (0 digitado)");

        in.close();
    }
}
