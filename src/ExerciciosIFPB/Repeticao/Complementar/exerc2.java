package ExerciciosIFPB.Repeticao.Complementar;

/*
2. Um número é, por definição, primo se ele não tem divisores, exceto 1 e ele
próprio. Faça um programa que mostre todos os números primos de 1 a N
(obs: N será lido).
 */

import java.util.Scanner;

public class exerc2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = in.nextInt();

        for(int i = 1; i <= numero; i++){
            if(ePrimo(i)){
                System.out.println("Número primo encontrado: " + i);
            }
        }

        in.close();
    }

    public static boolean ePrimo(int num){
        boolean primo = true;

        for(int i = 2; i < num; i++){
            if(num % i == 0){
                primo = false;
                break;
            }
        }

        return primo;
    }
}
