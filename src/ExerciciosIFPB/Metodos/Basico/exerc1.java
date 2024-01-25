package ExerciciosIFPB.Metodos.Basico;

/*
1. Escreva um método chamada menor que receba 3 números e retorne o menor
deles. Faça também um programa para testar a função.
 */

public class exerc1 {
    public static void main(String[] args) {
        System.out.println(menor(1, 2, 3));
        System.out.println(menor(34,56,12));
    }

    public static int menor(int num1, int num2, int num3){
        int maior1_2 = Math.min(num1, num2);
        return Math.min(maior1_2, num3);
    }
}
