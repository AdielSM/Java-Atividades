package DesafiosAula;

/*
*  Challenge:
*  Step 1: Create a double variable with the value 20.00
* Step 2: Create a second variable of type double with the value 80.00
* Step 3: Add both numbers together and multiply by 100.00
* Step 4: Use the remainder operator to figure out what the remainder from the result of the operation in Step 3 and 40.00.
* We used the modulus or remainder operator on ints in the course, but we can also use it on a double.
* Step 5: Create a boolean variable that assigns the value true if the remainder in #4 is 0, or false if its not zero.
* Step 6: Output the boolean variable
* Step 7: Write an if-then statement that displays a message "Got some remainder" if the boolean in step 5 is not true.
* */


public class LogicOperators {
    public static void main(String[] args) {

        double doubleValue1 = 20.00, doubleValue2 = 80.00, total;

        total = 100 * (20 + 80);

        System.out.println("Total: " + total);

        total %= 40;

        boolean boolValue = total == 0.00;

        System.out.println(boolValue);

        if (!boolValue){
            System.out.println("get some remainder");
        }
    }
}
