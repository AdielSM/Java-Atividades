package ExerciciosW3school.Basico;

/*
Write a Java program to convert an integer number to a binary number.
Input Data:
Input a Decimal Number : 5
Expected Output

Binary number is: 101
 */

import java.util.Scanner;

public class exerc19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = in.nextInt();

        System.out.println("O número " + num + " em binário é: " + Integer.toBinaryString(num));
    }
}
