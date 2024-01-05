package ExerciciosIFPB.Decisao.Basico;

/*
Escreva um programa que leia o peso (kg) e a altura (m) de uma pessoa, determine e mostre o
seu grau de obesidade, de acordo com a tabela seguinte. O grau de obesidade é determinado
pelo índice de massa corpórea, cujo cálculo é realizado dividindo-se o peso da pessoa pelo
quadrado da sua altura.

Valor do IMC Grau de Obesidade
< 18,5 Baixo peso
≥ 18,5 e < 25 Normal
≥ 25 e < 30 Sobrepeso
≥ 30 Obesidade
 */

import java.util.Scanner;

public class exerc7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o peso em Kg e a altura em Metros: ");
        double peso = in.nextDouble(), altura = in.nextDouble(), imc = peso / Math.pow(altura, 2);

        System.out.println(tipoIMC(imc));

    }
    public static String tipoIMC(double imc){
        if (imc < 18.5){
            return "Baixo Peso";
        }
        else if (imc >= 18.5 && imc < 25) {
            return "Normal";
        }
        else if (imc >= 25 && imc < 30) {
            return "Sobrepeso";
        }
        return "Obesidade";
    }
}
