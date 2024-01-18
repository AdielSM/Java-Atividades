package ExerciciosIFPB.Repeticao.Complementar;

/*
3. O algoritmo de Euclides para determinar o MDC entre dois números inteiros
consiste em formar uma sequência de inteiros cujos dois primeiros
elementos são os números dados. Cada elemento seguinte é o resto da
divisão dos dois anteriores. A sequência terminará quando um elemento dela
for nulo. O MDC entre os números dados é o elemento anterior ao zero. Faça
uma implementação deste programa.
Ex: Dados os números 12 e 15, será formada a sequência: 12, 15, 12, 3, 0 e o
MDC entre 12 e 15 é 3.
 */

import java.util.Scanner;

public class exerc3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int anterior, atual, proximo;

        System.out.print("Digite o primeiro número: ");
        anterior = in.nextInt();

        System.out.print("Digite o segundo número: ");
        atual = in.nextInt();

        while(atual != 0){
            proximo = anterior % atual;
            anterior = atual;
            atual = proximo;
        }

        System.out.println(anterior);

        in.close();
    }
}
