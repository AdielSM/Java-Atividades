package CodePractices;

/*
Write a method isLeapYear with a parameter of type int named year.

The parameter needs to be greater than or equal to 1 and less than or equal to 9999.

If the parameter is not in that range return false.

Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is, otherwise return false.

A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.

Write another method getDaysInMonth with two parameters month and year.  ​Both of type int.

If parameter month is < 1 or > 12 return -1. ​

If parameter year is < 1 or > 9999 then return -1.

This method needs to return the number of days in the month. Be careful about leap years they have 29 days in month 2 (February).
 */

public class NumberDaysInMonth {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(4, 2020));
        System.out.println(getDaysInMonth(4, 2021));
        System.out.println(getDaysInMonth(4, 2018));
        System.out.println(getDaysInMonth(13, 2020));
        System.out.println(getDaysInMonth(2, 2021));
        System.out.println(getDaysInMonth(2, 2019));
    }

    public static boolean isLeapYear(int year){
        if (year < 1 || year > 9999){
            return false;
        } else return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static int getDaysInMonth(int month, int year){
        if (year < 1 || year > 9999){
            return -1;
        } else {
            return switch (month){
                case 1, 7, 8, 5, 3, 10, 12 -> 31;
                case 4, 9, 6, 11 -> 30;
                case 2 -> isLeapYear(year) ? 29 : 28;
                default -> -1;
            };
        }
    }
}
