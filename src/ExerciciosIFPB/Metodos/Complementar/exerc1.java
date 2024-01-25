package ExerciciosIFPB.Metodos.Complementar;

/*
1. Escreva um método chamado vogal que receba uma letra e verifique se a letra é uma
vogal, retornando o valor True nesse caso, ou o valor False caso contrário.
Escreva também um programa que leia uma frase e, usando a função vogal criada,
imprima a quantidade de vogais existentes na frase lida.
 */

public class exerc1 {
    public static void main(String[] args) {
        String frase = "O mundo precisa de mais amor";
        int cont = 0;
        for (int i = 0; i < frase.length(); i++) {
            cont += vogal(frase.charAt(i)) ? 1 : 0;
        }

        System.out.println("A frase '" + frase + "' possui " + cont + " vogais.");
    }

    public static boolean vogal(char letra) {
        letra = Character.toLowerCase(letra);
        return letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';
    }
}
