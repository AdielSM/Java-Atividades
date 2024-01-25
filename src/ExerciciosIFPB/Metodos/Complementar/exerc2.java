package ExerciciosIFPB.Metodos.Complementar;

/*
2. Escreva um método chamado primo para determinar se um número é primo ou não. A
função deve receber um número inteiro, retornar true se o número for primo, ou false
caso contrário.
Escreva também um programa que, usando o método primo criado, exiba os números
primos entre 1 e 100.
 */

public class exerc2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.print(primo(i) ? i + " " : "");
        }
    }
    public static boolean primo(int num){

        if (num <= 1) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
