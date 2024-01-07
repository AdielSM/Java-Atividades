package ExerciciosIFPB.Decisao.Complementar;

/*
1. Escreva um programa que solicite a digitação de um número (de 1 a 7) correspondente a um dia
da semana e imprima o nome do dia da semana e se é dia útil (de segunda a sexta) ou final de
semana (sábado e domingo). Considere que o dia 1 é o domingo.
 */

import java.util.Scanner;

public class exerc1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número para um dia da semana: ");
        int numero = in.nextInt();

        String[] dias = {"Segunda","Terça","Quarta","Quinta","Sexta","Sábado","Domingo"};
        String dia = dias[numero - 1];


        if (numero == 1 || numero == 7){
            System.out.println("Dia: " + dia);
            System.out.println("Tipo: fim de semana.");
        } else {
            System.out.println("Dia: " + dia);
            System.out.println("Tipo: dia útil.");
        }
    }
}
