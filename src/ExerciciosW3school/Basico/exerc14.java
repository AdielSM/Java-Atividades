package ExerciciosW3school.Basico;

/*
14. Write a Java program to print an American flag on the screen.
Expected Output

* * * * * * ==================================
 * * * * *  ==================================
* * * * * * ==================================
 * * * * *  ==================================
* * * * * * ==================================
 * * * * *  ==================================
* * * * * * ==================================
 * * * * *  ==================================
* * * * * * ==================================
==============================================
==============================================
==============================================
==============================================
==============================================
==============================================
 */

public class exerc14 {
    public static void main(String[] args) {
        int starLines = 9, flagLines = 15;

        String linhaMenor = "==================================";
        String linhaMaior = "==============================================";
        String starImpar = "* * * * * * ";
        String starPar = " * * * * *  ";

        for (int i = 1; i <= flagLines; i++){
            if (i % 2 != 0 && i <= starLines){
                System.out.println(starImpar + linhaMenor);
            }
            else if (i % 2 == 0 && i <= starLines){
                System.out.println(starPar + linhaMenor);
            }
            else{
                System.out.println(linhaMaior);
            }
        }

    }
}
