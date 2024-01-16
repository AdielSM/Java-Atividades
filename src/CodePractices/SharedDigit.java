package CodePractices;

/*
Write a method named hasSharedDigit with two parameters of type int.

Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.

The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.
 */

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(12, 13));
    }

    public static boolean hasSharedDigit(int number1, int number2) {
        if ((number1 < 10 || number1 > 99) || (number2 < 10 || number2 > 99)) return false;

        int number1LastDigit = number1 % 10;
        int number2LastDigit = number2 % 10;
        int number1FirstDigit = number1 / 10;
        int number2FirstDigit = number2 / 10;

        return (number1LastDigit == number2LastDigit || number1LastDigit == number2FirstDigit) || (number1FirstDigit == number2LastDigit || number1FirstDigit == number2FirstDigit);
    }
}
