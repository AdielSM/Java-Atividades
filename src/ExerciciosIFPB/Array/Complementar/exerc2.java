package ExerciciosIFPB.Array.Complementar;

/*
2. Dados dois vetores A e B contendo N elementos inteiros cada (N, A e B serão
lidos), gerar e exibir um vetor C (de tamanho N*2) cujos elementos sejam a
intercalação dos elementos de A e B.
Ex: N = 3, A = [18, 12, 20], B = [15, 10, 7], C = [18, 15, 12, 10, 20, 7]
 */

public class exerc2 {
    public static void main(String[] args) {
        int[] A = {18, 12, 20};
        int[] B = {15, 10, 7};
        int[] C = new int[A.length + B.length];

        for (int i = 0; i < A.length; i++) {
            C[i * 2] = A[i];
            C[i * 2 + 1] = B[i];
        }

        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
    }
}
