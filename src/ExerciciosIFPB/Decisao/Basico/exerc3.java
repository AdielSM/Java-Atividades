package ExerciciosIFPB.Decisao.Basico;

/*
3. Escreva um programa que leia 3 números inteiros, determine e mostre o maior deles.
 */

import java.util.Scanner;

public class exerc3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite 3 números inteiros: ");
        long num1 = in.nextLong(), num2 = in.nextLong(), num3 = in.nextLong(), maior;

        long[] numeros = {num1, num2, num3};

        maior = numeros[0];
        for (int i = 1; i < numeros.length; i++){
            long index = numeros[i];
            if (index > maior){
                maior = index;
            }
            // maior = Math.max(maior, numeros[i]);
        }

        System.out.println("O maior número é: " + maior);

        in.close();
    }
}
