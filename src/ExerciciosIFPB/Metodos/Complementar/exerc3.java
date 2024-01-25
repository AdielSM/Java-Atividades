package ExerciciosIFPB.Metodos.Complementar;

import java.util.Scanner;

/*
3. Escreva um programa que leia N números inteiros (máximo 20) e armazene em um
vetor X. Calcule a média dos elementos do vetor e informe quantos elementos estão
abaixo da média do conjunto.
Crie os seguintes métodos:
• Um método que faça a leitura dos elementos de um vetor de inteiros. Ele
deve receber como parâmetro o número de elementos do vetor e deve retornar o
vetor preenchido.
• Um método que calcule a média dos elementos de um vetor. Ele deve
receber como parâmetro um vetor e retornar a média dos elementos dele.
• Um método que receba um vetor e um número, e retorne quantos elementos do
vetor estão abaixo desse número.
 */
public class exerc3 {

    public static void main(String[] args) {
        int[] numeros = povoarVetor(5);
        double media = media(numeros);
        System.out.println("A média dos números é: " + media);
        System.out.println("Existem " + abaixoMedia(numeros, media) + " números abaixo da média.");
    }

    public static int[] povoarVetor(int quantidadeNumeros){
        Scanner in = new Scanner(System.in);

        quantidadeNumeros = Math.min(quantidadeNumeros, 20);

        int[] numeros = new int[quantidadeNumeros];
        for(int i = 0; i < quantidadeNumeros; i++){
            System.out.print("Digite o número #" + (i+1) + ": ");
            numeros[i] = in.nextInt();
        }

        in.close();
        return numeros;
    }

    public static double media(int[] vetor){
        double soma = 0;
        for(int num : vetor){
            soma += num;
        }

        return Math.floor(soma / (vetor.length) * 100) / 100;
    }

    public static int abaixoMedia(int[] vetor, double numero){
        int cont = 0;
        for(int num : vetor){
            cont += num < numero ? 1 : 0;
        }

        return cont;
    }
}
