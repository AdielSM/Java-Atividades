package DesafiosAula;

/*
In this challenge, your task is to write a method, with the name sumDigits that has one int parameter called number.
The method should only take a number that is a positive number.
If a negative number is passed, return -1 to indicate an invalid value.
The method should calculate the sum of the digits in the number passed.
 */

public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sumDigits(1234));
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(4));
        System.out.println(sumDigits(32123));

    }

    public static int sumDigits(int number) {

        if (number < 10) {
            return -1;
        }

        int result = 0;
        while (number > 0) {
            result += number % 10;
            number /= 10;
        }

        return result;
    }
}
