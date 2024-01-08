package ExerciciosW3school.Basico;

/*
15. Write a Java program to swap two variables.
 */

import java.util.Scanner;

public class exerc15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite 2 valores inteiros a seguir: ");
        int num1 = in.nextInt(), num2 = in.nextInt(), aux;

        System.out.println("Antes do swap: " + "\nnum1 = " + num1
                            + "\nnum2 = " + num2);

        aux = num1;
        num1 = num2;
        num2 = aux;

        System.out.println("Depois do swap: " + "\nnum1 = " + num1
                + "\nnum2 = " + num2);
    }
}
