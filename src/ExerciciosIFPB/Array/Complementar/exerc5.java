package ExerciciosIFPB.Array.Complementar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
5. Faça um programa para ler as 5 dezenas apostadas por 5 apostadores e
verificar se a aposta é válida (cada dezena está entre [1, 80] e não pode haver
repetição). O programa deverá calcular e exibir a quantidade de números
acertados em cada aposta.
Atenção! As dezenas sorteadas são: 9, 32, 47.
 */
public class exerc5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] dezenasPremiadas = {9, 32, 47};

        int counter = 0;
        while(counter < 5){
            System.out.println();
            System.out.println("Apostador " + (counter+1 + "\n"));

            ArrayList<Integer> numeros = lerNumeros(5);

            int acertos = 0;
            for(int i : numeros){
                if(Arrays.binarySearch(dezenasPremiadas, i) >= 0){
                    acertos++;
                }
            }

            if(acertos >= 1){
                System.out.println("Obrigado por acreditar na sorte! Você acertou " + acertos + " " +
                        "dezena(s) de um total de " + dezenasPremiadas.length  +
                        " dezenas premiadas!");
            } else {
                System.out.println("Você não acertou nenhum número, não foi dessa vez...");
            }

            counter++;
        }
    }

    public static ArrayList<Integer> lerNumeros(int quantidadeNumeros){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> numerosRecebidos = new ArrayList<>();

        for(int i = 0; i < quantidadeNumeros; i++){
            System.out.print("Digite a dezena #" + (i+1) + ": ");
            int num = in.nextInt();

            if(numerosRecebidos.contains(num)){
                System.out.println("Dezena já digitada, por favor, tente novamente.");
                i--;
                continue;
            } else if(num < 0 || num > 80){
                System.out.println("Digite apenas uma dezena entre 0 e 80.");
                i--;
                continue;
            }
            numerosRecebidos.add(num);
        }

        return numerosRecebidos;
    }


}
