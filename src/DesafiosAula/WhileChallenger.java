package DesafiosAula;

/*
Step 1 is create a method called isEvenNumber that takes a parameter of type int
Its purpose is to determine if the argument passed to the method is an even number or not
return true if an even number, otherwise return false;

Next, use a while loop to test a range of numbers, from 5, up to and including 20, but
printing out only the even numbers found, determined by calling the isEvenNumber method

Step 2 is to modify the while code.
Make it also record the total number of even numbers it has found
and break once 5 are found
and at the end, display the total number of even numbers found
 */

public class WhileChallenger {

    public static void main(String[] args) {
        int nums = 5;
        int oddFound = 0;
        int evenFound = 0;


        while(nums <= 20){

            if(isEvenNumber(nums)){
                evenFound++;
                System.out.println("Número par encontrado: " + nums);

                if (evenFound == 5){
                    System.out.println("Loop encerrado, 5 números pares encontrados." +
                            "\nNúmeros ímpares encontrados: " + oddFound);
                    break;
                }
            }

            else{
                oddFound++;
            }

            nums++;
        }
    }

    public static boolean isEvenNumber(int num){
        return num % 2 == 0;
    }
}
