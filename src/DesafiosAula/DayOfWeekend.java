package DesafiosAula;

/*
Create a method called printDayOfWeek, that takes a int parameter called day, but does not return anything.

Use the switch statement to print out the corresponding name of the day of the week. So that 0 prints "Sunday", 1 prints "Monday", 2 prints "Tuesday", and so on.
Any other day prints "Invalid day".

Use the enhanced switch statement as an expression, returning the result to a String name daayOfTheWeek.
 */

public class DayOfWeekend {

        public static void main(String[] args) {
            printDayOfWeek(0);
            printDayOfWeek(1);
            printDayOfWeek(2);
            printDayOfWeek(3);
            printDayOfWeek(4);
            printDayOfWeek(5);
            printDayOfWeek(6);
            printDayOfWeek(7);
        }

        public static void printDayOfWeek(int day){
            String dayOfTheWeek = switch (day){
                case 0 -> "Sunday";
                case 1 -> "Monday";
                case 2 -> "Tuesday";
                case 3 -> "Wednesday";
                case 4 -> "Thursday";
                case 5 -> "Friday";
                case 6 -> "Saturday";
                default -> "Invalid day";
            };

            System.out.println(dayOfTheWeek);
        }

}
