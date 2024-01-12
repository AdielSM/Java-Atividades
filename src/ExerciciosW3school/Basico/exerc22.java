package ExerciciosW3school.Basico;

/*
22. Write a Java program to convert a binary number to a decimal number.
Input Data:
Input a binary number: 100
Expected Output

Decimal Number: 4
 */

import java.util.Scanner;

public class exerc22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número binário: ");
        String num = in.next();

        int total = 0;
        for(int i = 0; i < num.length(); i++){
            total += num.charAt(i) == '1' ? (int) Math.pow(2, num.length() - i - 1) : 0;
        }

        System.out.println("Número decimal: " + total);


    }
}
