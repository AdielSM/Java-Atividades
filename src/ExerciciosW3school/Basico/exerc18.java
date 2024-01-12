package ExerciciosW3school.Basico;

import java.util.Scanner;

/*
18. Write a Java program to multiply two binary numbers.
Input Data:
Input the first binary number: 10
Input the second binary number: 11
Expected Output

Product of two binary numbers: 110
 */
public class exerc18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número binário: ");
        String bin1 = in.nextLine();

        System.out.print("Digite outro número binário: ");
        String bin2 = in.nextLine();

        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);
        int mult = num1 * num2;

        System.out.println("A multiplicação dos dois números binários é: " + Integer.toBinaryString(mult));
    }
}
