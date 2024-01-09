package ExerciciosIFPB.Repeticao.While;

/*
6. Chico tem 1,50 metros e cresce 2 centímetros por ano, enquanto Zé tem 1,10
metros e cresce 3 centímetros por ano. Faça um programa que calcule e
imprima quantos anos serão necessários para que Zé seja maior que Chico.
 */

public class exerc6 {
    public static void main(String[] args) {

        double chicoAltura = 1.50, zeAltura = 1.10;
        int anos = 0;


        while(chicoAltura >= zeAltura){
            chicoAltura += 0.02;
            zeAltura += 0.03;
            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos.");
    }
}
