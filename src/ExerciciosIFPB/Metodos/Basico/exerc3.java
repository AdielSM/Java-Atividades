package ExerciciosIFPB.Metodos.Basico;

/*
3. Escreva um método chamado vertical que receba como parâmetro uma string e
a exiba na vertical, ou seja, com uma letra em cada linha. Faça também um
programa para testar a função.
 */

public class exerc3 {

    public static void main(String[] args) {
        vertical("Hello World");
    }

    public static void vertical(String str){
        for(int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i));
        }
    }
}
