/**
 * Created by Trinity on 12/12/15.
 */
import java.util.Scanner;

public class YahtzeeDriver
{
    /*
    1. Creates a new instance of the YahtzeeGame class
    2. Calls the playGame method on the Yahtzee object
    3. Asks user if they would like to play again
    4. When the user is done playing, prints the number of games played, min, max, and average score
    */
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        int answer;
        int score;
        int gameCount = 0;
        int minScore = 3000;
        int maxScore = 0;
        double average = 0;

        do {
            YahtzeeGame myGame = new YahtzeeGame();
            System.out.println("Welcome to Trinity's APCSA Yahtzee Game!");
            score = myGame.playGame();

            System.out.println("Would you like to play again? (1. Yes or 2. No):");
            answer = s.nextInt();
            gameCount++;
            if(score>maxScore)
                maxScore=score;
            if(score<minScore)
                minScore=score;
            average+=score;

        } while (answer ==1);

        average = average/gameCount;

        System.out.println("Number of games played: "+gameCount);
        System.out.println("Minimum score: "+minScore);
        System.out.println("Maximum score: "+maxScore);
        System.out.println("Average score: "+average);

    }
}
