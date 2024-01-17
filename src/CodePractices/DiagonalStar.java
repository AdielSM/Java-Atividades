package CodePractices;

/*

Write a method named printSquareStar with one parameter of type int named number.

If number is < 5, the method should print "Invalid Value".

The method should print diagonals to generate a rectangular pattern composed of stars (*). This should be accomplished by using loops

The patterns above consist of a number of rows and columns (where number is the number of rows to print). For each row or column, stars are printed based on four conditions (Read them carefully):

In the first or last row

In the first or last column

When the row number equals the column number

When the column number equals rowCount - currentRow + 1 (where currentRow is current row number)
 */
public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(5);
        printSquareStar(8);
        printSquareStar(2);
        printSquareStar(1);
        printSquareStar(-1);
    }

    public static void printSquareStar(int number){
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for (int row = 1; row <= number; row++){
            for (int column = 1; column <= number; column++){
                if (row == 1 || row == number || column == 1 || column == number || row == column || column == number - row + 1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
