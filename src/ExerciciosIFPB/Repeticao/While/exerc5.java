package ExerciciosIFPB.Repeticao.While;

/*
5. Faça um programa que leia um número inteiro e determine se ele é par ou
ímpar. Ao final, o programa deve perguntar se o usuário deseja continuar
(digitar outro número) ou sair. Se o usuário quiser continuar, o programa deve
repetir tudo de novo, caso contrário o programa deve ser encerrado.
 */

import java.util.Scanner;

public class exerc5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true){
            System.out.print("Digite um número inteiro: ");
            long numero = in.nextLong();

            String tipo = numero % 2 == 0 ? "Par" : "Ímpar";
            System.out.println("O número digitado é " + tipo);

            System.out.println("Deseja continuar? (s/n) ");
            String opcao = in.next().toUpperCase();

            if (opcao.equals("N")) {
                break;
            }
        }

        in.close();
    }
}
