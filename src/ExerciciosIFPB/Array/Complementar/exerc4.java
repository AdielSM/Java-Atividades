package ExerciciosIFPB.Array.Complementar;

/*
4. Escreva um programa para ler 6 números distintos, ou seja, não podem repetir.
Exiba os números lidos.
 */

import java.util.Scanner;

public class exerc4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[6];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            int num = sc.nextInt();
            if (i == 0) {
                numeros[i] = num;
            } else {
                for (int j = 0; j < i; j++) {
                    if (num == numeros[j]) {
                        System.out.println("Número já digitado, digite outro número.");
                        i--;
                        break;
                    } else {
                        numeros[i] = num;
                    }
                }
            }
        }

        System.out.println("Números digitados: ");
        for(int num : numeros){
            System.out.print(num + " ");
        }

    }
}
