package ExerciciosW3school.Basico;

/*
21. Write a Java program to convert a decimal number to an octal number.
Input Data:
Input a Decimal Number: 15
Expected Output

Octal number is: 17
 */

import java.util.Scanner;

public class exerc21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = in.nextInt();

        System.out.println("O número " + num + " em octal é " + Integer.toOctalString(num));
    }
}
