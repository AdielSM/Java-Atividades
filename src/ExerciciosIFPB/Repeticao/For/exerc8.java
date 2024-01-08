package ExerciciosIFPB.Repeticao.For;

/*
8. Faça um programa que leia um número inteiro N, calcule e mostre o maior
quadrado perfeito menor ou igual a N. Por exemplo, se N for igual a 38, o
resultado é 36.
 */

import java.util.Scanner;

public class exerc8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = in.nextInt();

        System.out.println(quadradoPerfeito(numero));

    }

    public static int quadradoPerfeito(int numero){
        int maiorQuadrado = 0;

        for(int i = 0; i <= numero; i++){
            int aux = i*i;

            if (aux > numero){
                break;
            }
            maiorQuadrado = aux;
        }

        return maiorQuadrado;
    }
}
