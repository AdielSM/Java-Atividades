package ExerciciosIFPB.Repeticao.While;

/*
8. O cardápio de uma casa de lanches, especializada em sanduíches, é dado a
seguir.

CÓDIGO      NOME                PREÇO
  H         Hamburger           R$ 5,00
  C         Cheese Burger       R$ 6,00
  B         Cheese Bacon        R$ 7,00
  F         Cheese Frango       R$ 4,00

Faça um programa que leia o código e a quantidade de cada item comprado
por um cliente (a leitura do código “X” indica o fim dos dados de entrada). Ao
final, calcule e exiba o total a pagar.
Veja o exemplo abaixo, considerando que o cliente pediu 3 Hamburger e 2
Cheese Bacon:
Entrada:
Código: H
Quantidade: 3
Código: B
Quantidade: 2
Código: X
Saída:
Total a pagar: R$ 29.00
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class exerc8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Map<String, Double> codigos = new HashMap<String, Double>(){{
           put("H", 5.00);
           put("C", 6.00);
           put("B", 7.00);
           put("F", 4.00);
        }};

        double conta = 0;
        while(true){
            System.out.print("Código: ");
            String codigo = in.next().toUpperCase();

            if (codigo.equals("X")){
                break;
            }

            System.out.print("Quantidade: ");
            int quantidade = in.nextInt();

            conta += codigos.get(codigo) * quantidade;
        }

        System.out.println("Conta encerrada!\nValor Total: R$" + conta);
        in.close();
    }
}
