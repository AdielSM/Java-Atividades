package ExerciciosIFPB.Repeticao.For;

/*
3. Faça um programa que calcule e mostre o fatorial de um número N, fornecido
pelo usuário.
 */

import java.util.Scanner;

public class exerc3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        long numero = in.nextLong();

        System.out.println("Fatorial de " + numero + ": " + fatorial(numero));

        in.close();

    }

    public static long fatorial(long num){
        long resultado = 1;

        for(int i = 2; i <= num; i++){
            resultado *= i;
        }

        return resultado;
    }
}
