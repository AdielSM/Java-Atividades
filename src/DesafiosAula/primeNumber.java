package DesafiosAula;

/*
Write a method called isPrime with one parameter of type int named number.
The method needs to return a boolean.
It should return true if the number is prime, otherwise it should return false.

Create a prime number counter variable (int).
Create a for statement, using any range of numbers, where the maximum number is  1000

for each number in the range:
    if the number is a prime number, increment the count and print it out
    if that count is 3 exit the for loop
 */

import java.util.Random;

public class primeNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int count = 0;

        for (int i = 1; i <= 1000; i+=random.nextInt(100)){
            if (isPrime(i)){
                count++;
                System.out.println("Número " + i + " é um número primo.");
            }

            if (count == 3){
                System.out.println("Saindo do loop. 3 números primos encontrados.");
                break;
            }
        }
    }

    public static boolean isPrime(int number){
        if (number <= 2){
            return number == 2;
        }

        for (int i = 2; i <= number / 2; i++){
            if (number % i == 0){
                return false;
            }
        }

        return true;
    }

}
