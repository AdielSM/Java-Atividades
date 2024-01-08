package ExerciciosIFPB.Repeticao.For;

/*
1. Faça um programa que calcule e mostre os números múltiplos de 5 do
intervalo 50 a 300, juntamente com suas raízes e seus cubos.
 */

public class exerc1 {
    public static void main(String[] args) {
        for (int i = 50; i <= 300; i+=5){
            double raiz = Math.sqrt(i), cubo = Math.pow(i, 3);
            System.out.println("Múltiplo: " + i +
                                " Raíz: " + raiz +
                                " Cubo: " + cubo);
        }
    }
}
