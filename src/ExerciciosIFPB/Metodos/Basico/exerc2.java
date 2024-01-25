package ExerciciosIFPB.Metodos.Basico;

/*
2. Escreva um método chamado fatorial que receba um número inteiro e retorne
seu fatorial. Faça também um programa para testar a função.
 */

public class exerc2 {
    public static void main(String[] args) {
        System.out.println(fatorial(5));
        System.out.println(fatorial(10));
    }

    public static int fatorial(int num){
        int fatorial = 2;
        for(int i = 3; i <= num; i++){
            fatorial *= i;
        }

        return fatorial;
    }
}
