package ExerciciosIFPB.Introducao.Basico;

import java.util.Scanner;

/*
6. Faça um programa que efetue a apresentação do valor da conversão em real (R$)
de um valor lido em dólar (US$). O algoritmo deverá solicitar o valor da cotação do
dólar e também a quantidade de dólares disponíveis com o usuário.
 */
public class exerc6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite a cotação atual do dólar: ");
        double cotacao = in.nextDouble();

        System.out.print("Digite quantos dólares você tem: ");
        double dolars = in.nextDouble();

        double reais = dolars * cotacao;

        System.out.println("Você possui em dolár o equivalente a R$" + reais);


    }
}
