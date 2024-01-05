package ExerciciosW3school.Basico.Math;
import java.util.Scanner;
/*
5. Write a Java program that takes two numbers as input and displays the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125
 */

public class exerc5 {
    public static void main(String[] args) {
        Scanner nums = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = nums.nextInt();

        System.out.print("Digte outro número: ");
        int num2 = nums.nextInt();

        int total = num1 * num2;

        System.out.println("Resultado: " + total);

    }
}
