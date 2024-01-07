package ExerciciosIFPB.Decisao.Complementar;

/*
Escreva um programa para determinar as raízes de uma equação de segundo grau, dados os
seus coeficientes.
Obs: se Δ for negativo, não existem as raízes da equação.
 */

import java.util.Scanner;

public class exerc5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o elemento a, b e c da equação: ");
        double a = in.nextDouble(), b = in.nextDouble(), c = in.nextDouble(), delta = b*b - 4 * a * c;

        if (delta < 0){
            System.out.println("Não existem raízes para a equação.");
        } else {
            double[] raizes = bhaskara(a, b, delta);
            double raiz1 = raizes[0], raiz2 = raizes[1];

            System.out.println("Primeira raíz: " + raiz1 + "\nSegunda raíz: " + raiz2);
        }

        in.close();
    }

    public static double[] bhaskara(double a, double b, double delta){
        double raiz1, raiz2, deltaRaiz;
        deltaRaiz = Math.sqrt(delta);

        raiz1 = (-b + deltaRaiz) / (2 * a);
        raiz2 = (-b - deltaRaiz) / (2 * a);

        return new double[]{raiz1, raiz2};

    }
}
