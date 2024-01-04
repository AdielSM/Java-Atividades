package Teoria;

public class OperadoresLogicos {
    public static void main(String[] args) {

        /*
        and -> &&
        or -> ||
        not -> !
        equal -> ==
        not equal -> !=
        greater than ->  >
        greater than or equal to ->  >=
        less than ->  <
        less than or equal to ->  <=

        ternary operator ->  condition ? then : else

         */

        int topScore = 100;
        if (topScore == 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;

        if (wasCar) {
            System.out.println("wasCar is true");
        }

    }
}
