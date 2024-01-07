package ExerciciosW3school.Basico;

import java.util.Scanner;

/*
13. Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5


Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

public class exerc13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite a altura do retângulo: ");
        double altura = in.nextDouble();

        System.out.print("Digite a largura do retângulo: ");
        double largura = in.nextDouble();

        System.out.println("Área do retângulo: " + (altura * largura));
        System.out.println("Perímetro do retângulo: " + (2 * (altura + largura)));

        in.close();
    }
}
