package ExerciciosIFPB.Strings.Complementar;

/*
1. Faça um programa que leia o email de uma pessoa e mostre, separadamente, qual o login e
qual o domínio.
Por exemplo, suponha que o email seja "fulano@provedor.com.br", então o login será "fulano"
e o domínio será "provedor.com.br".
 */

import java.util.Scanner;

public class exerc1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um email: ");
        String email = in.nextLine();

        String[] emailSplit = email.split("@");
        System.out.println("Login: " + emailSplit[0]);
        System.out.println("Domínio: " + emailSplit[1]);

        in.close();
    }
}
