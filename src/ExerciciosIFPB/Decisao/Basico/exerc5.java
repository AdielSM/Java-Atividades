package ExerciciosIFPB.Decisao.Basico;

import java.util.Scanner;

/*
5. A empresa Vende Tudo Ltda paga o salário de cada vendedor com uma comissão de 5% sobre o

total de vendas daquele vendedor, mas essa comissão nunca deve ser inferior ao salário-
mínimo. Escreva um programa que leia o valor total das vendas de um vendedor e escreva seu

salário.
 */
public class exerc5 {
    public static void main(String[] args) {
        double SALARIO_MINIMO = 1380;
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o valor total das vendas do vendedor: ");
        double valorVendas = in.nextDouble(), comissao = valorVendas * 0.05;
        
        double salario = (comissao >= SALARIO_MINIMO) ? comissao : SALARIO_MINIMO;
        // double salario = Math.max(comissao, SALARIO_MINIMO);

        System.out.println("Salário do vendedor: R$" + salario);
    }
}
