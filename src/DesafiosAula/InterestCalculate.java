package DesafiosAula;

/*
 Using the for statement, call the calculateInterest method with
 the amount of 100. Use the interest rates between 7.5% and 10%. Increment
 the interest rate by 0.25%.
 Print the results to the console window.
 */

public class InterestCalculate {
    public static void main(String[] args) {

        for (double i = 7.5; i <= 10; i += 0.25){
            System.out.println(calculateInterest(100, i));
        }

    }

    public static double calculateInterest(double amount, double interestRate){
        return amount * (interestRate / 100);
    }
}
