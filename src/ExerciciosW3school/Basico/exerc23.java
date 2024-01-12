package ExerciciosW3school.Basico;

/*
23. Write a Java program to convert a binary number to a hexadecimal number.
Input Data:
Input a Binary Number: 1101
Expected Output

HexaDecimal value: D
 */

import java.util.Scanner;

public class exerc23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número binário: ");
        String num = in.next();

        int numBin = Integer.parseInt(num, 2);
        String numHex = Integer.toHexString(numBin).toUpperCase();

        System.out.println("Hexadecimal: " + numHex);
    }
}
