package ExerciciosIFPB.Introducao.Complementar;

/*
1. A Companhia de Carros Usados João Honesto paga seus empregados um salário de R$
1.000,00 por mês mais uma comissão de R$ 200,00 por cada carro vendido mais 5% do
valor da venda.
Escreva um programa que leia o nome, o número de carros vendidos e o valor total das
vendas de um vendedor, e calcule e exiba o seu salário.
 */

import java.util.Scanner;

public class exerc1 {
    public static void main(String[] args) {
        double SALARIO_FIXO = 1000.00;
        double COMISSAO_CARRO_VENDIDO = 200.00;
        double PORCENT_DA_VENDA = 0.05;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite o nome do vendedor, carros vendidos por ele e o valor total das vendas:");

        String nome = in.nextLine();
        int carrosVendidos = in.nextInt();
        double valorEmVendas = in.nextDouble();

        double salario = SALARIO_FIXO + (carrosVendidos * COMISSAO_CARRO_VENDIDO) + (valorEmVendas * PORCENT_DA_VENDA);

        System.out.println("O salário do vendedor " + nome + " é R$" + salario);

        in.close();
    }
}
