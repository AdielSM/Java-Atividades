package ExerciciosIFPB.Strings.Complementar;

/*
3. Faça um programa que leia o nome de uma pessoa e exiba-o conforme o exemplo abaixo.
Obs: Suponha que o nome lido não possua nenhuma preposição, artigo, etc.
Exemplo:
Entrada: FLAVIO RIBEIRO COUTINHO
Saída: COUTINHO, F. R.
 */

import java.util.Scanner;

public class exerc3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nome = in.nextLine().toUpperCase();

        String[] nomeSplit = nome.split(" ");
        StringBuilder nomeF = new StringBuilder(nomeSplit[nomeSplit.length - 1] + ", ");

        for(int i = 0; i <= nomeSplit.length - 2; i++){
            nomeF.append(nomeSplit[i].charAt(0) + ". ");
        }

        System.out.println(nomeF);
        in.close();
    }
}
