package CodePractices;

/*
Write a method called checkNumber with an int parameter named number.



The method should not return any value, and it needs to print out:

    - "positive" if the parameter number is > 0

    - "negative" if the parameter number is < 0

    - "zero" if the parameter number is equal to 0



NOTE:  The checkNumber method needs to be defined as public static like we have been doing so far in the course.

 */

public class PositiveNegativeOrZero {
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

    public static class NumberInWord {

            public static void main(String[] args) {
                printNumberInWord(0);
                printNumberInWord(1);
                printNumberInWord(2);
                printNumberInWord(3);
                printNumberInWord(4);
                printNumberInWord(5);
                printNumberInWord(6);
                printNumberInWord(7);
                printNumberInWord(8);
                printNumberInWord(9);
                printNumberInWord(10);
                printNumberInWord(-1);
            }

            public static void printNumberInWord(int number){
                String numberInWord = switch (number){
                    case 0 -> "ZERO";
                    case 1 -> "ONE";
                    case 2 -> "TWO";
                    case 3 -> "THREE";
                    case 4 -> "FOUR";
                    case 5 -> "FIVE";
                    case 6 -> "SIX";
                    case 7 -> "SEVEN";
                    case 8 -> "EIGHT";
                    case 9 -> "NINE";
                    default -> "OTHER";
                };

                System.out.println(numberInWord);
            }
    }
}
