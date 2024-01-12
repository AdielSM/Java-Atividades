package ExerciciosW3school.Basico;

/*
 Write a Java program to add two binary numbers.
in Data:
in first binary number: 10
in second binary number: 11
Expected Output

Sum of two binary numbers: 101
 */

import java.util.Scanner;

public class exerc17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o primeiro número binário: ");
        String bin1 = in.nextLine();

        System.out.print("Digite o segundo número binário: ");
        String bin2 = in.nextLine();

        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);
        int sum = num1 + num2;

        System.out.println("A soma dos dois números binários é: " + Integer.toBinaryString(sum));
    }
}
