package ExerciciosIFPB.Introducao.Basico;

/*
Escreva um programa para ler o nome e o sobrenome de uma pessoa e escrevê-
los na seguinte forma: sobrenome seguido por uma vírgula e pelo nome
 */

import java.util.Scanner;

public class exerc5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Escreva seu primeiro nome: ");
        String nome = in.next();

        System.out.print("Escreva seu sobrenome: ");
        String sobrenome = in.next();

        System.out.println(sobrenome + ", " + nome);
    }
}
