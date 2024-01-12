package ExerciciosW3school.Basico;

import java.util.Scanner;

/*
24. Write a Java program to convert a binary number to an octal number.
Input Data:
Input a Binary Number: 111
Expected Output

Octal number: 7
 */
public class exerc24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número binário: ");
        String num = in.next();

        int numBin = Integer.parseInt(num, 2);
        String numHex = Integer.toOctalString(numBin);

        System.out.println("Octal: " + numHex);
    }
}
