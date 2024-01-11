package DesafiosAula;

/*
create two method with the same name
    - one with one parameter (inches)
    - one with two parameters (feet, inches)
    - return the centimeters
    - 1 inch = 2.54cm
    - 1 foot = 12 inches
 */


public class OverloadingCmChallenger {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(6, 0));
        System.out.println(convertToCentimeters(7, 5));
        System.out.println(convertToCentimeters(0, 1));
        System.out.println(convertToCentimeters(0, 13));
        System.out.println(convertToCentimeters(0, 0));

    }

    public static double convertToCentimeters(int inches){
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches){
        return convertToCentimeters(feet * 12 + inches);
    }

}
