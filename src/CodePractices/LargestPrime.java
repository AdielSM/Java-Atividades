package CodePractices;

/*
Write a method named getLargestPrime with one parameter of type int named number.

If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.

The method should calculate the largest prime factor of a given number and return it.
 */

public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21)); // 7
        System.out.println(getLargestPrime(217)); // 31
        System.out.println(getLargestPrime(0)); // -1
        System.out.println(getLargestPrime(45)); // 5
        System.out.println(getLargestPrime(-1)); // -1
        System.out.println(getLargestPrime(7)); // 7
        System.out.println(getLargestPrime(2)); // 2
    }

    public static int getLargestPrime(int number){
        if (number <= 1) return -1;

        int largestPrime = 0;

        for (int i = 2; i <= number; i++){
            if (number % i == 0){
                boolean isPrime = true;

                for (int j = 2; j < i; j++){
                    if (i % j == 0){
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) largestPrime = i;
            }
        }

        return largestPrime;
    }
}
