package ExerciciosIFPB.Repeticao.While;

/*
2. Faça um programa que leia vários números, calcule e exiba a média desses
números.
Obs: a leitura do número 999 indica o fim dos dados de entrada e não deve ser
computado na média)
 */

import java.util.Scanner;

public class exerc2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite algum número: ");
        int opcao = in.nextInt(), quantidadeNumeros = 1, somaTotal = opcao, media;

        while(true){
            System.out.print("Digite outro número: ");
            opcao = in.nextInt();

            if (opcao == 999){
                break;
            }

            somaTotal += opcao; quantidadeNumeros++;
        }

        media = somaTotal / quantidadeNumeros;

        System.out.println("A média dos números digitados é: " + media);

        in.close();
    }
}
