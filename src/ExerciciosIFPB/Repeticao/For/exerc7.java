package ExerciciosIFPB.Repeticao.For;

import java.util.Scanner;

/*
7. Um número é, por definição, primo se ele não tem divisores, exceto 1 e ele
próprio. Faça um programa que leia um número e determine se ele é ou não
primo.
 */

public class exerc7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        long num = in.nextLong();

        if (numeroPrimo(num)){
            System.out.println("O número " + num + " é primo.");
        } else {
            System.out.println("O número " + num + " não é primo.");
        }

        in.close();
    }

    public static boolean numeroPrimo(long numero){
        boolean verificador = true;

        for(int i = 2; i < numero; i++){
            if (numero % i == 0){
                verificador = false;
                break;
            }
        }

        return verificador;
    }

}
