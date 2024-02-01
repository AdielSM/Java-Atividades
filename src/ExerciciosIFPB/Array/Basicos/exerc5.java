package ExerciciosIFPB.Array.Basicos;

/*
5. Escreva um programa que receba um vetor V de N números inteiros (N será lido),
determine e exiba o maior e o menor elemento deste vetor e seus respectivos
índices.
Obs: suponha a inexistência de valores repetidos.
 */
public class exerc5 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = maiorMenor(array);
        System.out.printf("Maior: %d, índice: %d\nMenor: %d, índice: %d", result[0], result[1], result[2], result[3]);
    }

    public static int[] maiorMenor(int[] array) {
        int maior = array[0];
        int menor = array[0];
        int indexMaior = 0;
        int indexMenor = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];
                indexMaior = i;
            }
            if (array[i] < menor) {
                menor = array[i];
                indexMenor = i;
            }
        }

        return new int[]{maior, indexMaior, menor, indexMenor};
    }
}
