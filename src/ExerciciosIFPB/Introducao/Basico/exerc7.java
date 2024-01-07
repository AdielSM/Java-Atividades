package ExerciciosIFPB.Introducao.Basico;
/*
7. O restaurante a quilo Bem-Bão cobra R$25,00 por cada quilo de refeição. Faça um
programa que leia o peso do prato montado pelo cliente (em quilos) e exiba o valor
a pagar. Assuma que a balança já desconte o peso do prato.
 */

import java.util.Scanner;

public class exerc7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double PRECO_KG = 25.00;

        System.out.print("Digite o peso em kg do prato do cliente: ");
        double peso = in.nextDouble();

        System.out.println("Valor a pagar: R$" + (peso * PRECO_KG));

        in.close();
    }
}
