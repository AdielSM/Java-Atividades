package ExerciciosIFPB.Strings.Complementar;

import java.util.Scanner;

/*
6. Escreva um programa que, a partir da digitação do infinitivo de um verbo regular, faça a
conjugação dele no presente do indicativo para as pessoas do singular e plural. Veja o exemplo
abaixo.
Entrada:
CANTAR
Saída:
Eu canto
Tu cantas
Ele canta
Nós cantamos
Vós cantais
Eles cantam
 */
public class exerc6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um verbo regular: ");
        String verbo = in.nextLine();
        String terminacao = terminacao(verbo);
        String radical = radical(verbo);

        printIndicativo(radical, terminacao);
        in.close();
    }

    public static void printIndicativo(String radical, String terminacao){
        if (terminacao.equals("ar")){
            System.out.printf("""
                    Eu %s
                    Tu %s
                    Ele %s
                    Nós %s
                    Vós %s
                    Eles %s
                    """, radical + "o", radical + "as", radical + "a",
                    radical + "amos", radical + "ais", radical + "am");
        } else if (terminacao.equals("er")) {
            System.out.printf("""
                    Eu %s
                    Tu %s
                    Ele %s
                    Nós %s
                    Vós %s
                    Eles %s
                    """, radical + "o", radical + "es", radical + "e",
                    radical + "emos", radical + "eis", radical + "em");
        } else {
            System.out.printf("""
                    Eu %s
                    Tu %s
                    Ele %s
                    Nós %s
                    Vós %s
                    Eles %s
                    """, radical + "o", radical + "es", radical + "e",
                    radical + "imos", radical + "tis", radical + "em");
        }
    }

    public static String terminacao(String verbo){
        return verbo.substring(verbo.length()-2);
    }

    public static String radical(String verbo){
        return verbo.substring(0, verbo.length()-2);
    }
}
