package ExerciciosIFPB.Repeticao.For;

import java.util.Scanner;

/*
6. Faça um programa que leia 3 números inteiros (N, X, Y) e mostre todos os
números múltiplos de N entre X e Y.
 */
public class exerc6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("N: ");
        int n = in.nextInt();

        System.out.print("X: ");
        int x = in.nextInt();

        System.out.print("Y: ");
        int y = in.nextInt();

        System.out.println("Múltiplos de " + n + " de " + x + " até " + y + ": ");

        int ultimoMultiplo;
        for(int i = x; i <= y; i++){
            if (i % n == 0){
                ultimoMultiplo = i;

                if(y - ultimoMultiplo < n){
                    System.out.println(i + ".");
                }
                else{
                    System.out.print(i + ", ");
                }
            }
        }

        in.close();
    }
}
