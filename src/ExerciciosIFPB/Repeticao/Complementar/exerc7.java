package ExerciciosIFPB.Repeticao.Complementar;

/*
7. Uma certa empresa pretende verificar se os seus empregados estarão
qualificados ou não para aposentadoria em 2024.
Para estar em condições, um dos seguintes requisitos deve ser satisfeito:
• Ter no mínimo 65 anos de idade; ou
• Ter trabalhado no mínimo 30 anos; ou
• Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.
Com base nas informações acima, faça um programa para:
• Ler o nome do empregado, o ano de nascimento e o ano de seu ingresso
na empresa.
• Calcular e exibir a idade e o tempo de trabalho do empregado (estimado
ao final de 2023)
• Exibir a mensagem “Pode Requerer Aposentadoria” se atender aos
requisitos ou “Não Pode Requerer Aposentadoria” caso contrário.
Ao final de cada execução, o programa deverá perguntar se o usuário deseja
fazer nova verificação. Se sim, o programa deverá repetir tudo novamente,
caso contrário deverá encerrar.
 */

import java.util.Scanner;

public class exerc7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int anoAtual = 2024;

        while(true){
            System.out.print("Digite o nome do empregado: ");
            String name = in.nextLine();

            System.out.print("Digite o seu ano de nascimento: ");
            int anoNascimento = in.nextInt();

            System.out.print("Digite o seu ano de ingresso na empresa: ");
            int anoIngresso = in.nextInt();

            int idade = anoAtual - anoNascimento;
            int tempoTrabalho = anoAtual - 1 - anoIngresso;

            System.out.println("Idade: " + idade);
            System.out.println("Tempo de trabalho: " + tempoTrabalho);

            if (idade >= 65 || tempoTrabalho >= 30 || (idade >= 60 && tempoTrabalho >= 25)){
                System.out.println("Pode Requerer Aposentadoria");
            } else {
                System.out.println("Não Pode Requerer Aposentadoria");
            }

            System.out.println("Deseja continuar? (s/n)");
            char opcao = in.next().charAt(0);

            if (opcao == 'n'){
                break;
            }

            in.nextLine();
        }

        System.out.println("Fim do programa");

        in.close();
    }
}
