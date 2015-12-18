/**
 * Created by Trinity on 12/18/15.
 */

import java.util.Scanner;

public class YahtzeeGame
{
    /* instance data should include the five yahtzee dice, a scoreboard, and a CONSTANT (static final) variable NUM_SIDES
    which should be set to six (the number of sides on a yahtzee die) */
    private YahtzeeDie a;
    private YahtzeeDie b;
    private YahtzeeDie c;
    private YahtzeeDie d;
    private YahtzeeDie e;
    private YahtzeeScorecard x;
    private static final int NUM_SIDES = 6;
    int turnCount = 0;
    Scanner s = new Scanner(System.in);


    /* initializes the dice and scoreboard */
    public YahtzeeGame()
    {
        a = new YahtzeeDie(NUM_SIDES);
        b = new YahtzeeDie(NUM_SIDES);
        c = new YahtzeeDie(NUM_SIDES);
        d = new YahtzeeDie(NUM_SIDES);
        e = new YahtzeeDie(NUM_SIDES);

        x = new YahtzeeScorecard();
    }

    /* check to see if the game is over, and while the game is not over call the method takeTurn()
    once the game ends (hint: there are 13 turns in a game of Yahtzee), the method should print a
    final scorecard and return the grand total */
    public int playGame()
    {
        while(turnCount<13){
            takeTurn();
        }
        if(turnCount==13){
            System.out.println(this.x);}
        return x.getGrandTotal();
    }

    private void takeTurn()
    {
        int count = 0;

        a.rollDie();
        b.rollDie();
        c.rollDie();
        d.rollDie();
        e.rollDie();

        printDice();

        System.out.println("Are you satisfied with your roll or would you like to roll again? (s/r)");
        String answer = new String(s.nextLine());
        if (answer.equals("s")){
            markScore();
        }
        while (answer.equals("r")&& count<=2){
            chooseFrozen();
            rollDice();
            printDice();
            count++;

            System.out.println("Are you satisfied with your roll or would you like to roll again? (s/r)");
            answer = (s.nextLine());
        }
        turnCount++;
    }

    private void rollDice()
    {
        if(!a.isFrozen()){
            a.rollDie();
            a.unfreezeDie();
        }
        if(!b.isFrozen()){
            b.rollDie();
            b.unfreezeDie();
        }
        if(!c.isFrozen()){
            c.rollDie();
            c.unfreezeDie();
        }
        if(!d.isFrozen()){
            d.rollDie();
            d.unfreezeDie();
        }
        if(!e.isFrozen()){
            e.rollDie();
            e.unfreezeDie();
        }
    }

    private void chooseFrozen()
    {
        System.out.println("Which dice would you like frozen?");
        String frozen = s.nextLine();
        int x = frozen.length();
        int count = 0;
        while (count<=x){
            int y = (int)frozen.charAt(count);

            switch (y){
                case 1: a.isFrozen();
                case 2: b.isFrozen();
                case 3: c.isFrozen();
                case 4: d.isFrozen();
                case 5: e.isFrozen();
            }
            y++;
            count++;
        }
    }

    private void printDice()
    {
        System.out.println(a.getValue() +"\t"+ b.getValue() +"\t"+ c.getValue()+"\t"+d.getValue()+"\t"+e.getValue());
    }

    private void markScore()
    {
        x.printScoreCard();
        System.out.print("Where would you like to put your score?");

        int category = s.nextInt();
        switch (category){

            case 1:x.markOnes(a.getValue(), b.getValue(), c.getValue(), d.getValue(), e.getValue());
            case 2:x.markTwos(a.getValue(), b.getValue(),c.getValue(),d.getValue(),e.getValue());
            case 3:x.markThrees(a.getValue(), b.getValue(),c.getValue(),d.getValue(),e.getValue());
            case 4:x.markFours(a.getValue(), b.getValue(),c.getValue(),d.getValue(),e.getValue());
            case 5:x.markFives(a.getValue(), b.getValue(),c.getValue(),d.getValue(),e.getValue());
            case 6:x.markSixes(a.getValue(), b.getValue(),c.getValue(),d.getValue(),e.getValue());
            case 7:x.markThreeOfAKind(a.getValue(), b.getValue(),c.getValue(),d.getValue(),e.getValue());
            case 8:x.markFourOfAKind(a.getValue(), b.getValue(),c.getValue(),d.getValue(),e.getValue());
            case 9:x.markFullHouse(a.getValue(), b.getValue(),c.getValue(),d.getValue(),e.getValue());
            case 10:x.markSmallStraight(a.getValue(), b.getValue(),c.getValue(),d.getValue(),e.getValue());
            case 11:x.markLargeStraight(a.getValue(), b.getValue(),c.getValue(),d.getValue(),e.getValue());
            case 12:x.markYahtzee(a.getValue(), b.getValue(),c.getValue(),d.getValue(),e.getValue());
                default: System.out.println("Error");

        }
    }
}