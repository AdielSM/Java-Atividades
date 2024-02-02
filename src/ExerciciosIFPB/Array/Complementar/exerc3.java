package ExerciciosIFPB.Array.Complementar;

/*
3. Escreva um programa para ler 6 números. Após a leitura dos números, verifique,
para cada um deles, se é distinto, ou seja, não possui repetição.
 */

import java.util.ArrayList;

public class exerc3 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 2, 5, 6};
        ArrayList<Integer> numerosNaoDistintos = new ArrayList<>();
        boolean distinto = true;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[j] == numeros[i] && i != j) {
                    distinto = false;
                    break;
                }
            }

            if(!distinto && !numerosNaoDistintos.contains(numeros[i])){
                System.out.printf("O número %d possui repetições no array. %n", numeros[i]);
                numerosNaoDistintos.add(numeros[i]);
            } else if(distinto){
                System.out.printf("O número %d não possui repetições. %n", numeros[i]);
            }
            distinto = true;
        }
    }
}
