package ExerciciosIFPB.Introducao.Basico;

import java.util.Scanner;

/*
Escreva um programa para calcular a área de um triângulo, dados os valores de
base e altura.
 */

public class exerc4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o valor da base do triângulo: ");
        double base = in.nextDouble();

        System.out.print("Digte o valor da altura do triângulo: ");
        double altura = in.nextDouble();

        double area = areaTriangulo(base, altura);
        System.out.println("A área do triângulo é igual a " + area);
    }

    public static double areaTriangulo(double base, double altura){
        return base * altura / 2;
    }

}
