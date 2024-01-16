package CodePractices;

/*
Write a method called isPalindrome with one int parameter called number.

The method needs to return a boolean.

It should return true if the number is a palindrome number otherwise it should return false.
 */
public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrome(12345));
        System.out.println(isPalindrome(-12321));
        System.out.println(isPalindrome(0));
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int lastDigit;
        int temp = number;

        while (temp != 0) {
            lastDigit = temp % 10;
            reverse = reverse * 10 + lastDigit;
            temp /= 10;
        }

        return reverse == number;
    }
}
