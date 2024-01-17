package DesafiosAula;

/*
In this challenge, you'll read 5 valid numbers from the console, entered by the user,
and then print the sum of those five numbers.

You'll want to check that the numbers entered are all valid integers.
if not, just print the message Invalid Number, but keep reading until you have 5 valid integers.

Before the user enters each number, print the message Enter number #x: where x represents the count,
i.e. 1, 2, 3, 4, etc.

For example, the first message printed to the user would be Enter number #1:, the next Enter number #2:,
and so on.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0, counter = 1;

        while (counter <= 5){
            try {
                System.out.println("Enter the number #" + counter + ":");
                sum += in.nextInt();
                counter++;
            }
            catch (InputMismatchException e){
                System.out.println("Invalid number. Please try again");
                in.next();
            }
        }

        System.out.println("Sum: " + sum);
        in.close();
    }
}
