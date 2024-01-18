package DesafiosAula;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
use a endless loop which:
    - Prompts the user to enter a number, or any character to exit
    - Validates the input is a number
    - Keeps track of the min and max numbers entered
 */
public class MinAndMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, loopCount = 0;

        while(true){
            try{
                System.out.print("Write a number: ");
                int num = in.nextInt();
                max = Math.max(max,num);
                min = Math.min(min,num);

                loopCount++;
            }
            catch (InputMismatchException e){
                break;
            }
        }

        if (loopCount == 0){
            System.out.println("No data send");
        } else{
            System.out.println("Max: " + max +
                               "\nMin: " + min);
        }

        in.close();
    }
}
