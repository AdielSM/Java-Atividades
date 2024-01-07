package ExerciciosIFPB.Decisao.Complementar;

/*
4. Escreva um programa que leia a hora de início de um jogo e a hora do final do jogo (considerando
apenas horas inteiras), calcula a duração do jogo em horas, sabendo-se que o tempo máximo de
duração do jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.
O programa deve mostrar o resultado obtido.
 */

import java.util.Scanner;

public class exerc4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a hora inicial e a hora final do jogo: ");
        int horaInicial = in.nextInt(), horaFinal = in.nextInt(), duracao;

        if (horaInicial > horaFinal) {
            horaFinal += 24;
        }

        duracao = horaFinal - horaInicial;
        System.out.println("O jogo durou " + duracao + " horas");

        in.close();
    }
}
