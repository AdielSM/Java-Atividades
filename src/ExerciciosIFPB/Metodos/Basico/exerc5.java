package ExerciciosIFPB.Metodos.Basico;

/*
5. Escreva um programa que leia as 3 notas de um aluno, determine e exiba a sua
média e seu conceito.
O programa deve conter os seguintes métodos:
• Um método que recebe como parâmetros as 3 notas do aluno e retorne a sua
média (aritmética).
• Um método que receba como parâmetro a média do aluno e retorne o seu
conceito, de acordo com a tabela abaixo:

 MÉDIA              CONCEITO
 >= 8,0                A
 >= 5,0 e < 8,0        B
 < 5,0                 C
 */
public class exerc5 {
    public static void main(String[] args) {
        double media = media(10, 10, 10);
        double media2 = media(10, 8.5, 5);
        double media3 = media(10, 6.3, 5);
        System.out.println(media);
        System.out.println(conceito(media));
        System.out.println("_ _ _ _");
        System.out.println(media2);
        System.out.println(conceito(media2));
        System.out.println("_ _ _ _");
        System.out.println(media3);
        System.out.println(conceito(media3));
    }

    public static double media(double nota1, double nota2, double nota3) {
        return Math.floor((nota1 + nota2 + nota3) / 3 * 100) / 100;
    }

    public static String conceito(double media) {
        if (media >= 8) {
            return "A";
        } else if (media >= 5) {
            return "B";
        } else {
            return "C";
        }
    }
}
