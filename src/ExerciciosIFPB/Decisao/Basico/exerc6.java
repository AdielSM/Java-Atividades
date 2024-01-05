package ExerciciosIFPB.Decisao.Basico;

import java.util.Scanner;

/*
Recomendam-se estudantes para bolsas de estudo em função de seu desempenho.
A natureza das recomendações é baseada na seguinte tabela:

Conceito            Recomendação
    A           Fortemente recomendado
 B ou C             Recomendado
    D             Não Recomendado

Escreva um programa que leia o nome e o conceito de um estudante e exiba o nome do
estudante e sua respectiva recomendação.
 */
public class exerc6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o nome do Aluno e o seu Conceito: ");
        String nome = in.nextLine(), conceito = in.next().toUpperCase();

        switch(conceito){
            case "A":
                System.out.println("Fortemente Recomendado");
                break;
            case "B", "C":
                System.out.println("Recomendado");
                break;
            default:
                System.out.println("Não Recomendado");
        }
    }
}
