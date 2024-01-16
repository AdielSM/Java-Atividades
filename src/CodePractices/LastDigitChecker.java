package CodePractices;

/*
Write a method named hasSameLastDigit with three parameters of type int.

Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within the range, the method should return false.

The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.

Write another method named isValid with one parameter of type int.

The method needs to return true if the number parameter is in range of 10(inclusive) - 1000(inclusive), otherwise return false.
 */

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
        System.out.println(hasSameLastDigit(22, 23, 34));
        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));
    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
        if (!isValid(number1) || !isValid(number2) || !isValid(number3)) return false;

        int number1LastDigit = number1 % 10;
        int number2LastDigit = number2 % 10;
        int number3LastDigit = number3 % 10;

        return (number1LastDigit == number2LastDigit || number1LastDigit == number3LastDigit) || (number2LastDigit == number3LastDigit);
    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }
}
