package ExerciciosIFPB.Decisao.Basico;

/*
4. Escreva um programa que leia o nome e o sexo (M ou F) de uma pessoa e exiba a mensagem
"Olá, Sr. Fulano!" ou "Olá, Sra. Fulana!", de acordo com o sexo da pessoa. Obs: Fulano e Fulana
são nomes exemplos.
 */

import java.util.Scanner;

public class exerc4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite seu nome e seu sexo(M ou F): ");
        String nome = in.nextLine(), sexo = in.next().toUpperCase();

        if (sexo.equals("M")){
            System.out.println("Olá, Sr." + nome);
        } else {
            System.out.println("Olá, Sra." + nome);
        }

        in.close();
    }
}
