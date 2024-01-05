package ExerciciosW3school.Basico.Math;

/*7. Write a Java program that takes a number as input and prints its multiplication table up to 10.
Test Data:
Input a number: 8
Expected Output :
        8 x 1 = 8
        8 x 2 = 16
        8 x 3 = 24
        ...
        8 x 10 = 80

*/

import java.util.Scanner;

public class exerc7 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = number.nextInt();

        int i = 1;
        while(i <= 10){
            int result = num * i;
            System.out.println(num + " x " + i + " = " + result);
            i++;
        }
    }
}
