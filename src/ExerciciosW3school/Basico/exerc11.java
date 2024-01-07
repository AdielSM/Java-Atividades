package ExerciciosW3school.Basico;

/*
11. Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
 */

import java.util.Scanner;

public class exerc11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o tamanho do raio da circunferência: ");
        double raio = in.nextDouble(), area, perimetro;

        area = Math.PI * Math.pow(raio, 2);
        perimetro = 2 * Math.PI * raio;

        System.out.println("Perímetro: " + perimetro + "\nÁrea: " + area);

        in.close();
    }
}
