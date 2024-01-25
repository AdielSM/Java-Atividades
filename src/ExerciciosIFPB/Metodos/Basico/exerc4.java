package ExerciciosIFPB.Metodos.Basico;

/*
4. Escreva um método chamada soma que receba um vetor e retorne a soma dos
seus elementos.
Escreva também um programa que, dado o vetor V = { 6,3,8,7,2,5 } e usando a
função soma criada, informe a soma dos elementos do vetor V.
 */
public class exerc4 {
    public static void main(String[] args) {
        int[] array = {6,3,8,7,2,5};
        System.out.println(soma(array));
    }

    public static int soma(int[] array) {
        int soma = 0;
        for (int i : array){
            soma += i;
        }
        return soma;
    }
}
