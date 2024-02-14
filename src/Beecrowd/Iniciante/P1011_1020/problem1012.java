package Beecrowd.Iniciante.P1011_1020;

/*
Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.

Entrada
O arquivo de entrada contém três valores com um dígito após o ponto decimal.

Saída
O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das áreas descritas acima,
sempre com mensagem correspondente e um espaço entre os dois pontos e o valor. O valor calculado deve ser apresentado com 3 dígitos
após o ponto decimal.

Exemplos de Entrada	Exemplos de Saída
3.0 4.0 5.2           TRIANGULO: 7.800
                      CIRCULO: 84.949
                      TRAPEZIO: 18.200
                      QUADRADO: 16.000
                      RETANGULO: 12.000


12.7 10.4 15.2         TRIANGULO: 96.520
                        CIRCULO: 725.833
                        TRAPEZIO: 175.560
                        QUADRADO: 108.160
                        RETANGULO: 132.080


 */

public class problem1012 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double pi = 3.14159;

        double triangulo = A * C / 2;
        double circulo = pi * Math.pow(C, 2);
        double trapezio = (A + B) * C / 2;
        double quadrado = B * B;
        double retangulo = A * B;

        System.out.printf("TRIANGULO: %.3f\n", triangulo);
        System.out.printf("CIRCULO: %.3f\n", circulo);
        System.out.printf("TRAPEZIO: %.3f\n", trapezio);
        System.out.printf("QUADRADO: %.3f\n", quadrado);
        System.out.printf("RETANGULO: %.3f\n", retangulo);
    }
}
