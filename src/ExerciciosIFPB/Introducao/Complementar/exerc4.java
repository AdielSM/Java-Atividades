package ExerciciosIFPB.Introducao.Complementar;

/*
4. Um motorista anota a marcação do hodômetro do seu veículo antes e após uma viagem,
bem como o número de litros de combustível gastos.
Escreva um programa que leia os 3 dados acima, o preço do litro de combustível, a
capacidade do tanque e mostre:
a) Quilometragem rodada.
b) Quantos quilômetros por litro faz o veículo.
c) Autonomia do veículo.
d) Custo da viagem.
 */

import java.util.Scanner;

public class exerc4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite os Quilômetros iniciais: ");
        double kmInicial = in.nextDouble();

        System.out.print("Digite os Quilômetros finais: ");
        double kmFinal = in.nextDouble();

        System.out.print("Digite o número de litros de combustíveis gastos: ");
        double combustivelGasto = in.nextDouble();

        System.out.print("Digite o preço do combustível atual: ");
        double precoCombustivel = in.nextDouble();

        System.out.print("Capacidade do tanque em Litros: ");
        double capacidadeTanque = in.nextDouble();

        double kmRodados = kmFinal - kmInicial;
        double kmPorLitro = kmRodados / combustivelGasto;
        double autonomia = kmPorLitro * capacidadeTanque;
        double custoViagem = combustivelGasto * precoCombustivel;

        System.out.println("Quilômetros rodadas: " + kmRodados);
        System.out.println("Km p/ litro :" + kmPorLitro);
        System.out.println("Autonomia do veículo: " + autonomia);
        System.out.println("Custo da viagem: " + custoViagem);

        in.close();
    }
}
