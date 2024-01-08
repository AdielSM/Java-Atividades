package ExerciciosIFPB.Repeticao.For;

/*
2. Faça um programa que leia um número N, inteiro, e some todos os números
de 1 até N, mostrando o resultado.
 */

import java.util.Scanner;

public class exerc2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        long num = in.nextLong(), resultado = 0;

        for(int i = 1; i <= num; i++){
            resultado += i;
        }

        System.out.println("Soma de 1 até " + num + " é igual a " + resultado);

        in.close();
    }
}
