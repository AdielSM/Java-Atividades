package ExerciciosIFPB.Repeticao.While;

/*
7. Faça um programa que leia a idade de várias pessoas visitantes de um show (a
leitura da idade 0 indicará o fim dos dados de entrada), calcule e exiba:
• A média de idade do público;
• A porcentagem de pessoas com idade entre 18 e 21 anos;
• Idade do visitante mais jovem.
 */

import java.util.Scanner;

public class exerc7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int menorIdade = Integer.MAX_VALUE, quantidadePessoas = 0
                , somaIdades = 0, quantidadePessoasDe18a21 = 0;

        while(true){
            quantidadePessoas++;
            System.out.print("Digite a idade da pessoa " + quantidadePessoas + ": ");
            int idade = in.nextInt();

            if (idade == 0){
                break;
            }

            menorIdade = Math.min(menorIdade, idade);
            somaIdades += idade;

            if (idade >= 18 && idade <= 21){
                quantidadePessoasDe18a21++;
            }

        }

        double mediaIdades = (double) somaIdades / quantidadePessoas;
        double percentPessoas18a21 = (double) quantidadePessoasDe18a21 / quantidadePessoas * 100;

        System.out.println("Média de idade: " + mediaIdades +
                            "\nPorcentagem de pessoas de 18 a 21 anos: " + percentPessoas18a21 +
                            "\nIdade do visitante mais jovem: " + menorIdade);

        in.close();
    }
}
