package ExerciciosIFPB.Repeticao.While;

/*
3. Faça um programa que leia vários números, determine e mostre o maior e o
menor deles.
Obs: a leitura do número 0 (zero) encerra o programa.
 */

import java.util.Scanner;

public class exerc3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = in.nextInt(), maior = numero, menor = numero;

        while(true){
            System.out.print("Digite outro número inteiro: ");
            numero = in.nextInt();

            if (numero == 0){
                break;
            }

            maior = Math.max(numero, maior);
            menor = Math.min(numero, menor);

        }

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

        in.close();
    }
}
