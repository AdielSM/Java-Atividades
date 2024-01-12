package ExerciciosW3school.Basico;

/*
20. Write a Java program to convert a decimal number to a hexadecimal number.
Input Data:
Input a decimal number: 15
Expected Output

Hexadecimal number is : F
 */

import java.util.Scanner;

public class exerc20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número decimal: ");
        int num = in.nextInt();

        System.out.println("O número " + num + " em hexadecimal é: " + Integer.toHexString(num));

    }
}
