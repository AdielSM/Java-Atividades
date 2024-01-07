package ExerciciosIFPB.Decisao.Complementar;

/*
6. Na primeira etapa de um concurso, o candidato tem que fazer duas provas. Dessas duas notas é
tirada a média do candidato. Caso essa média seja maior ou igual a 7.0, ele estará apto a fazer a
segunda etapa do concurso. Na segunda etapa, ele fará mais uma prova, onde deverá obter uma
nota maior ou igual a 8.0 para ser aprovado no concurso.
Escreva um programa que leia as notas da primeira etapa, calcule a média da primeira etapa, e
se o candidato for aprovado na primeira etapa, leia a nota dele na segunda etapa e diga se ele
foi aprovado ou não no concurso.
 */

import java.util.Scanner;

public class exerc6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite as 2 primeiras notas do candidato: ");
        double nota1 = in.nextInt(), nota2 = in.nextInt(), nota3, media = (nota1 + nota2) / 2;

        if (media >= 7.0){
            System.out.println("Digite a terceira nota do candidato: ");
            nota3 = in.nextInt();

            if (nota3 >= 8.0){
                System.out.println("Candidato Aprovado!");
            } else{
                System.out.println("Candidato reprovado na segunda fase.");
            }
        } else {
            System.out.println("Candidato reprovado na primeira fase.");
        }

        in.close();
    }
}
