package ExerciciosW3school.Basico;

/*
Write a Java program to print a face.
 */

public class exerc16 {
    public static void main(String[] args) {

        String[] a = new String[5];

        a[0] = " +\"\"\"\"\"+ ";
        a[1]="[| o o |]";
        a[2]=" |  ^  | ";
        a[3]=" | '-' |";
        a[4]=" +-----+";

        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
    }
}
