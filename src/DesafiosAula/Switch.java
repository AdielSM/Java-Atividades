package DesafiosAula;

/*
    * Desafio:
    * 1. Criar um programa que receba uma palavra que só possua as 5 primeiras letras do alfabeto e retorne a palavra em código NATO
    * 2. Criar um método que receba um char e retorne a palavra em código NATO

 */

public class Switch {

    public static void main(String[] args) {
        String word = "Cabe";
        String nato = "";
        for (int i = 0; i < word.length(); i++) {
            nato += charToNATO(word.toUpperCase().charAt(i)) + " ";
        }
        System.out.println(nato);
    }

    public static String charToNATO(char letter){
        switch (letter){
            case 'A':
                return "Able";
            case 'B':
                return "Baker";
            case 'C':
                return "Charlie";
            case 'D':
                return "Dog";
            case 'E':
                return "Easy";
            default:
                return "Letra não encontrada: " + letter;
        }
    }
}
