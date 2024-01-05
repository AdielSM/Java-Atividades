package ExerciciosIFPB.Decisao.Basico;

import java.util.Scanner;

/*
8. Escreva um programa que tenha a funcionalidade de uma calculadora simples. O programa deve
solicitar a digitação de dois operandos e um operador (+ - x / %) e deve imprimir ao resultado
da operação aritmética. Caso o usuário digite um operador inválido, o programa deve imprimir
"Operador desconhecido".
 */

public class exerc8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Digite 2 números e um operador: ");

            double num1 = in.nextDouble(), num2 = in.nextDouble(), resultado;
            String operador = in.next().toUpperCase();

            try {
                resultado = calculadora(num1, num2, operador);
                System.out.println("Seu resultado é " + resultado);
                break;
            } catch (OperadorInvalido e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static double calculadora(double num1, double num2, String operador) throws OperadorInvalido {
        return switch (operador) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "X" -> num1 * num2;
            case "/" -> num1 / num2;
            case "%" -> num1 % num2;
            default -> throw new OperadorInvalido("Operador Inválido");
        };
    }
}


