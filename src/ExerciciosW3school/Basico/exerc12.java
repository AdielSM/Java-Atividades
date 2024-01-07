package ExerciciosW3school.Basico;

/*
12. Write a Java program that takes three numbers as input to calculate
and print the average of the numbers.
 */

import java.util.Scanner;

public class exerc12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite 3 números a seguir: ");
        double num1 = in.nextDouble(), num2 = in.nextDouble(), num3 = in.nextDouble();

        System.out.println("A média é igual a: " + ((num1 + num2 + num3) / 3));

        in.close();
    }
}
