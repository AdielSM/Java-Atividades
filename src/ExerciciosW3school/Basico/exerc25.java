package ExerciciosW3school.Basico;

/*
25. Write a Java program to convert a octal number to a decimal number.
Input Data:
Input any octal number: 10
Expected Output

Equivalent decimal number: 8
 */

import java.util.Scanner;

public class exerc25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um número octal: ");
        String input = in.next();

        System.out.println(Integer.parseInt(input, 8));
    }
}
