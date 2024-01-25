package ExerciciosIFPB.Strings.Complementar;

import java.util.Scanner;

/*
4. Faça um programa que leia uma string S e um valor inteiro N, e exiba na tela a string S com as
suas vogais repetidas N vezes.
Exemplo:
Entrada: S: Hoje tem aula de Java

N: 3

Saída: Hooojeee teeem aaauuulaaa deee jaaavaaa
 */
public class exerc4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = in.nextLine();

        System.out.print("Digite um número inteiro: ");
        int num = in.nextInt();

        for(int i = 0; i < frase.length(); i++){
            String letra = String.valueOf(frase.charAt(i));

            if(eVogal(letra)){
                System.out.print(letra.repeat(num));
                continue;
            }

            System.out.print(letra);
        }

        in.close();
    }

    public static boolean eVogal(String letra){
        letra = letra.toLowerCase();
        return letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u");
    }
}
