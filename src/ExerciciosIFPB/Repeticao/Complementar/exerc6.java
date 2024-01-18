package ExerciciosIFPB.Repeticao.Complementar;

/*
6. Faça um programa que solicite ao usuário uma senha. Caso a senha digitada
esteja correta, o programa deverá mostrar senha correta. Caso contrário, o
programa deverá mostrar senha incorreta e pedir para o usuário tentar
novamente digitar a senha correta. Mas, se o usuário fornecer três senhas
incorretas, o programa deverá encerrar a sua execução. (Obs: a senha correta
é “abcd”).
 */

import java.util.Scanner;

public class exerc6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String senha = "abcd";
        String senhaDigitada;
        int tentativas = 0;

        do {
            System.out.print("Digite a senha: ");
            senhaDigitada = in.next();

            if (senhaDigitada.equals(senha)) {
                System.out.println("Senha correta! " + senhaDigitada + " = " + senha);
                break;
            } else {
                System.out.println("Senha incorreta! Chances restantes: " + (2 - tentativas) + "\n");
                tentativas++;
            }
        } while (tentativas < 3);

        if (tentativas == 3) {
            System.out.println("Você excedeu o número de tentativas!");
        }
    }
}
