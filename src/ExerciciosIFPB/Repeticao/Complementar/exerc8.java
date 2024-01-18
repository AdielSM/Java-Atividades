package ExerciciosIFPB.Repeticao.Complementar;

/*
8. Faça um programa que acompanhe um set de uma partida de vôlei. O
programa deve ler o código da equipe (A ou B) que ganhou o ponto e
responder quem ganha a partida. O set chega ao final se uma das equipes
chega a 25 pontos e a diferença de pontos entre elas é maior ou igual a dois.
A equipe que conseguir isso é a vencedora do set.
 */

import java.util.Scanner;

public class exerc8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pontuacaoA = 0, pontuacaoB = 0, rodada = 1;
        String vencedor;

        while(true){
            if((pontuacaoA >= 25) && (pontuacaoA - pontuacaoB > 2)){
                vencedor = "A";
                break;
            }

            if ((pontuacaoB >= 25) && (pontuacaoB - pontuacaoA > 2)){
                vencedor = "B";
                break;
            }

            System.out.print("Digite a equipe que pontuou na rodada " + rodada + ": ");
            char opcao = in.next().toUpperCase().charAt(0);

            if (opcao == 'A'){
                pontuacaoA++;
            } else {
                pontuacaoB++;
            }

            System.out.println("Pontuação atual equipe A: " + pontuacaoA);
            System.out.println("Pontuação atual equipe B: " + pontuacaoB);
            rodada++;

        }

        if (vencedor.equals("A")){
            System.out.println("A equipe A venceu a partida com " + pontuacaoA + " pontos!");
        } else {
            System.out.println("A equipe B venceu a partida com " + pontuacaoB + " pontos!");
        }

        in.close();
    }
}
