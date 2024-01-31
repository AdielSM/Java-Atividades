package CodePractices;

import java.util.Arrays;

/*
Write a method called readInteger() that has no parameters and returns an int.

It needs to read in an integer from the user - this represents how many elements the user needs to enter.



Write another method called readElements() that has one parameter of type int

The method needs to read from the console until all the elements are entered, and then return an array containing the elements entered.



And finally, write a method called findMin() with one parameter of type int[]. The method needs to return the minimum value in the array.
 */
public class MinimumElement {
    public static void main(String[] args) {
        int[] array = readElements(readInteger());
        System.out.println(findMin(array));
    }

    public static int readInteger(){
        return 5; // should be read from the console
    }

    public static int[] readElements(int len){
        int[] array = new int[len];
        array[0] = 1; // should be read from the console
        array[1] = 3;
        array[2] = 2;
        array[3] = 7;
        array[4] = 0;
        return array;
    }

    public static int findMin(int[] array){
        Arrays.sort(array);
        return array[0];
    }
}
