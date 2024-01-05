package ExerciciosIFPB.Decisao.Basico;

/*
2. Escreva um programa que leia dois números e exiba-os em ordem crescente.
 */

import java.util.Scanner;

public class exerc2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite 2 números inteiros: ");
        long num1 = in.nextLong(), num2 = in.nextLong(), maior, menor;

        if (num1 > num2){
            maior = num1;
            menor = num2;

        } else {
            maior = num2;
            menor = num1;
        }

        // long maior = Math.max(num1, num2), menor = Math.min(num1, num2);
        System.out.println("Ordem Crescente: " + maior + ", " + menor);
    }
}
