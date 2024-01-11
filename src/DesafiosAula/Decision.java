package DesafiosAula;

/*
The first method should be called displayHighScorePosition.

It should have a players name as a parameter, and a 2nd parameter as a position in the high score table.

You should display the players name along with a message like “ managed to get into position ” and the position they got and a further message “ on the high score table”.

The second method should be called calculateHighScorePosition.

It should be sent one argument only, the player score.

It should return an int.

The return data should be :

1 if the score is >=1000

2 if the score is >=500 and < 1000

3 if the score is >=100 and < 500

4 in all other cases

Call both methods and display the results of the following:

a score of 1500, 1000, 500, 100 and 25.
 */

public class Decision {

    public static void main(String[] args) {

        int score1 = 1500,
            score2 = 1000,
            score3 = 500,
            score4 = 100,
            score5 = 25;

        int position1 = calculateHighScorePosition(score1),
            position2 = calculateHighScorePosition(score2),
            position3 = calculateHighScorePosition(score3),
            position4 = calculateHighScorePosition(score4),
            position5 = calculateHighScorePosition(score5);

        displayHighScorePosition("Player1", position1);
        displayHighScorePosition("Player2", position2);
        displayHighScorePosition("Player3", position3);
        displayHighScorePosition("Player4", position4);
        displayHighScorePosition("Player5", position5);

    }


    public static int calculateHighScorePosition(int playerScore){

        int data;

        if (playerScore >= 1000){
            data = 1;
        }
        else if (playerScore >= 500){
            data = 2;
        }
        else if (playerScore >= 100){
            data = 3;
        }
        else{
            data = 4;
        }

        return data;
    }

    public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName + " managed to get into position "
                + playerPosition + " on the high score list");
    }

}
