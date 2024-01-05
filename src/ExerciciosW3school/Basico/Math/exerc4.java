package ExerciciosW3school.Basico.Math;

/*
 Write a Java program to print the results of the following operations.
Test Data:
a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3
Expected Output :
43
1
19
13
*/

public class exerc4 {
    public static void main(String[] args) {
        int resultado1, resultado2, resultado3, resultado4;

        resultado1 = -5 + 8 * 6;
        resultado2 = (55+9) % 9;
        resultado3 = 20 + (-3 * 5) / 8;
        resultado4 = 5 + 15 / 3 * 2 - 8 % 3;


        System.out.println("Resultado 1 = " + resultado1);
        System.out.println("Resultado 2 = " + resultado2);
        System.out.println("Resultado 3 = " + resultado3);
        System.out.println("Resultado 4 = " + resultado4);

    }
}
