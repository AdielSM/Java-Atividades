package CodePratices;

/*
Write a method called checkNumber with an int parameter named number.



The method should not return any value, and it needs to print out:

    - "positive" if the parameter number is > 0

    - "negative" if the parameter number is < 0

    - "zero" if the parameter number is equal to 0



NOTE:  The checkNumber method needs to be defined as public static like we have been doing so far in the course.

 */

public class exerc1 {
    public static void main(String[] args) {
        checkNumber(5);
        checkNumber(-5);
        checkNumber(0);
    }
    public static void checkNumber(int number){
        String type = "zero";

        if(number > 0){
            type = "positive";
        } else if (number < 0){
            type = "negative";
        }

        System.out.println(type);
    }
}
