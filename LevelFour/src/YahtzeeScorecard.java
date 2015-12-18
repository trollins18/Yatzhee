/**
 * Created by Trinity on 12/14/15.
 */
public class YahtzeeScorecard {

        private int ones;
        private int twos;
        private int threes;
        private int fours;
        private int fives;
        private int sixes;
        private int threeKind;
        private int fourKind;
        private int fiveKind;
        private int chance;
        private int fullHouse;
        private int smStraight;
        private int lgStraight;
        private boolean bonus;

        public YahtzeeScorecard()
        {
         YahtzeeGame x = new YahtzeeGame();
            bonus = false;
            ones = -1;
            twos = -1;
            threes = -1;
            fours = -1;
            fives = -1;
            sixes = -1;
            threeKind = -1;
            fourKind = -1;
            fiveKind = -1;
            chance = -1;
            fullHouse = -1;
            smStraight = -1;
            lgStraight = -1;
        }

        public boolean markOnes(int die1, int die2, int die3, int die4, int die5)
        {
		int value = 0;
            if(ones!=-1)
            return false;
        else{
            if (die1==1)
                value+=die1;
            if (die2==1)
                value+=die2;
            if (die3==1)
                value+=die3;
            if (die4==1)
                value+=die4;
            if (die5==1)
                value+=die5;
            updateBonus();
                ones=value;
                return true;
            }
        }

        public boolean markTwos(int die1, int die2, int die3, int die4, int die5)
        {
            int value = 0;
            if(twos!=-1)
                return false;
            else{
                if (die1==2)
                    value+=die1;
                if (die2==2)
                    value+=die2;
                if (die3==2)
                    value+=die3;
                if (die4==2)
                    value+=die4;
                if (die5==2)
                    value+=die5;
                updateBonus();
                twos= value;
                return true;
            }
        }

        public boolean markThrees(int die1, int die2, int die3, int die4, int die5)
        {
            int value = 0;
            if(threes!=-1)
                return false;
            else{
                if (die1==3)
                    value+=die1;
                if (die2==3)
                    value+=die2;
                if (die3==3)
                    value+=die3;
                if (die4==3)
                    value+=die4;
                if (die5==3)
                    value+=die5;
                updateBonus();
                threes= value;
                return true;
            }
        }

        public boolean markFours(int die1, int die2, int die3, int die4, int die5)
        {
            int value = 0;
            if(fours!=-1)
                return false;
            else{
                if (die1==4)
                    value+=die1;
                if (die2==4)
                    value+=die2;
                if (die3==4)
                    value+=die3;
                if (die4==4)
                    value+=die4;
                if (die5==4)
                    value+=die5;
                updateBonus();
                fours= value;
                return true;
            }
        }

        public boolean markFives(int die1, int die2, int die3, int die4, int die5)
        {
            int value = 0;
            if(fives!=-1)
                return false;
            else{
                if (die1==5)
                    value+=die1;
                if (die2==5)
                    value+=die2;
                if (die3==5)
                    value+=die3;
                if (die4==5)
                    value+=die4;
                if (die5==5)
                    value+=die5;
                updateBonus();
                fives= value;
                return true;}
        }

        public boolean markSixes(int die1, int die2, int die3, int die4, int die5)
        {
            int value = 0;
            if(sixes!=-1)
                return false;
            else{
                if (die1==6)
                    value+=die1;
                if (die2==6)
                    value+=die2;
                if (die3==6)
                    value+=die3;
                if (die4==6)
                    value+=die4;
                if (die5==6)
                    value+=die5;
                updateBonus();
                sixes= value;
                return true;}
        }

        public boolean markThreeOfAKind(int die1, int die2, int die3, int die4, int die5)
        {
            YahtzeeSortDice x = new YahtzeeSortDice(die1,die2,die3,die4,die5);
            if(threeKind!=-1)
                return false;
            else{
                if(x.getFirst()==x.getSecond()&&x.getSecond()==x.getThird()){
                    threeKind = 20;
                }
                if(x.getSecond()==x.getThird()&&x.getThird()==x.getFourth()){
                    threeKind = 20;
                }
                if(x.getThird()==x.getFourth()&&x.getFourth()==x.getFifth()){
                    threeKind = 20;
                }
                return true;
            }
        }

        public boolean markFourOfAKind(int die1, int die2, int die3, int die4, int die5)
        {
            YahtzeeSortDice x = new YahtzeeSortDice(die1,die2,die3,die4,die5);
            if(fourKind!=-1)
                return false;
            else {
                if (x.getFirst() == x.getSecond() && x.getSecond() == x.getThird() && x.getThird() == x.getFourth()) {
                    threeKind = 20;
                }
                if (x.getSecond() == x.getThird() && x.getThird() == x.getFourth() && x.getFourth() == x.getFifth()) {
                    threeKind = 20;
                }
                return true;
            }
            }

        public boolean markFullHouse(int die1, int die2, int die3, int die4, int die5)
        {
            YahtzeeSortDice x = new YahtzeeSortDice(die1,die2,die3,die4,die5);


            int value = 0;
            if(fullHouse!=-1)
                return false;
            else{
                if(x.getFifth()==x.getFourth()||x.getFourth()==x.getThird()||x.getThird()==x.getSecond()||x.getSecond()==x.getFirst()){
                    if(x.getFirst()==x.getSecond()&&x.getSecond()==x.getThird()){
                        fullHouse = 25;
                    }
                    if(x.getSecond()==x.getThird()&&x.getThird()==x.getFourth()){
                        fullHouse = 25;
                    }
                    if(x.getThird()==x.getFourth()&&x.getFourth()==x.getFifth()){
                        fullHouse = 25;
                    }

                }
                return true;
            }
        }

        public boolean markSmallStraight(int die1, int die2, int die3, int die4, int die5)
        {
            YahtzeeSortDice x = new YahtzeeSortDice(die1,die2,die3,die4,die5);

            int value = 0;
            if(smStraight!=-1)
                return false;
            else{
                if((x.getFirst()==1||x.getSecond()==1)&&(x.getSecond()==2||x.getThird()==2)&&(x.getThird()==3||x.getFourth()==3)){
                    smStraight = 30;
                }
                smStraight = 0;
                return true;
            }
        }

        public boolean markLargeStraight(int die1, int die2, int die3, int die4, int die5)
        {
            YahtzeeSortDice x = new YahtzeeSortDice(die1,die2,die3,die4,die5);

            int value = 0;
            if(threeKind!=-1)
                return false;
            else{   if((x.getFirst()==1||x.getSecond()==1)&&(x.getSecond()==2||x.getThird()==2)&&(x.getThird()==3||x.getFourth()==3)&&(x.getFourth()==4||x.getFifth()==4)){
                lgStraight = 40;
                }
                lgStraight = 0;
                return true;
            }
            }


        public boolean markYahtzee(int die1, int die2, int die3, int die4, int die5)
        {
            if(fiveKind!=-1){
                return false;
            } else{
                if (die1==die2 && die2==die3 && die3==die4 && die4==die5){
                    fiveKind = 50;
                }
                fiveKind = 0;
                return true;
            }
        }

        public boolean markChance(int die1, int die2, int die3, int die4, int die5)
        {
            if(chance!=-1){
                return false;
            } else {
                chance = die1+die2+die3+die4+die5;
                return true;
            }
        }

        private void updateBonus()
        {
            if(bonus != true){
                if (getUpperTotal()>=63) {
                    bonus = true;
                }
                }
         }

        public int getUpperTotal()
        {
            int total=0;
            if(ones!=-1){
                total+=ones;
            }
            if(twos!=-1){
                total+=twos;
            }
            if(threes!=-1){
                total+=threes;
            }
            if(fours!=-1){
                total+=fours;
            }
            if(fives!=-1){
                total+=fives;
            }
            if(sixes!=-1){
                total+=sixes;
            }
            return total;
        }

        public int getLowerTotal()
        {
            int total =0;
            if(threeKind!=-1){
                total+=threeKind;
            }
            if(fourKind!=-1){
                total+=fourKind;
            }
            if(fullHouse!=-1){
                total+=fullHouse;
            }
            if(smStraight!=-1){
                total+=smStraight;
            }
            if(lgStraight!=-1){
                total+=lgStraight;
            }
            if(fiveKind!=-1){
                total+=fiveKind;}
            if(chance!=-1){
                total+=chance;}
            return total;

        }

        /* 	returns the grand total, remember incompletes (-1s) should not be factored in! */
        public int getGrandTotal()
        {
            return getLowerTotal() + getUpperTotal();

        }

        /*	Prints a scorecard with the current total, using "__" to mark uncompleted fields and a number to mark filled fields
            Sample:
            **********************************
            *  	    Yahtzee Score Card		 *
            *  					`		  	 *
            * 	Ones:				__		 *
            * 	Twos:				__		 *
            * 	Threes:				__		 *
            * 	Fours:				__		 *
            * 	Fives:				25		 *
            * 	Sixes:				__		 *
            *								 *
            *	Upper Bonus:		 0		 *
            * 	Upper Total:   		25		 *
            *								 *
            *	3 of Kind:			__		 *
            * 	4 of Kind:			__		 *
            * 	Full House:			25		 *
            * 	Sm Straight:		__		 *
            * 	Lg  Straight:		__		 *
            * 	Yahtzee:	  		 0		 *
            * 	Chance:				__		 *
            *								 *
            * 	Lower Total:		25		 *
            *								 *
            * 	Grand Total:		50		 *
            **********************************
            already implemented
        */
        public void printScoreCard()
        {
            System.out.println();
            System.out.println("*********************************");
            System.out.println("*      Yahtzee Score Card       *");
            System.out.println("*                               *");
            System.out.print("*  Ones:\t\t");
            if(ones==-1)System.out.print("__");
            else System.out.print(ones);
            System.out.println("\t*");
            System.out.print("*  Twos:\t\t");
            if(twos==-1)System.out.print("__");
            else System.out.print(twos);
            System.out.println("\t*");
            System.out.print("*  Threes:\t\t");
            if(threes==-1)System.out.print("__");
            else System.out.print(threes);
            System.out.println("\t*");
            System.out.print("*  Fours:\t\t");
            if(fours==-1)System.out.print("__");
            else System.out.print(fours);
            System.out.println("\t*");
            System.out.print("*  Fives:\t\t");
            if(fives==-1)System.out.print("__");
            else System.out.print(fives);
            System.out.println("\t*");
            System.out.print("*  Sixes:\t\t");
            if(sixes==-1)System.out.print("__");
            else System.out.print(sixes);
            System.out.println("\t*");
            System.out.println("*\t\t\t\t*");
            System.out.print("*  Upper Bonus:\t\t");
            if(bonus)System.out.print("35");
            else System.out.print("0");
            System.out.println("\t*");
            System.out.print("*  Upper Total:\t\t");
            System.out.print(this.getUpperTotal());
            System.out.println("\t*");
            System.out.println("*                               *");
            System.out.print("*  3 of Kind:\t\t");
            if(threeKind==-1)System.out.print("__");
            else System.out.print(threeKind);
            System.out.println("\t*");
            System.out.print("*  4 of Kind:\t\t");
            if(fourKind==-1)System.out.print("__");
            else System.out.print(fourKind);
            System.out.println("\t*");
            System.out.print("*  Full House:\t\t");
            if(fullHouse==-1)System.out.print("__");
            else System.out.print(fullHouse);
            System.out.println("\t*");
            System.out.print("*  Sm Straight:\t\t");
            if(smStraight==-1)System.out.print("__");
            else System.out.print(smStraight);
            System.out.println("\t*");
            System.out.print("*  Lg Straight:\t\t");
            if(lgStraight==-1)System.out.print("__");
            else System.out.print(lgStraight);
            System.out.println("\t*");
            System.out.print("*  Yahtzee:\t\t");
            if(fiveKind==-1)System.out.print("__");
            else System.out.print(fiveKind);
            System.out.println("\t*");
            System.out.print("*  Chance:\t\t");
            if(chance==-1)System.out.print("__");
            else System.out.print(chance);
            System.out.println("\t*");
            System.out.println("*                               *");
            System.out.print("*  Lower Total:\t\t");
            System.out.print(this.getLowerTotal());
            System.out.println("\t*");
            System.out.println("*                               *");
            System.out.print("*  Grand Total:\t\t");
            System.out.print(this.getGrandTotal());
            System.out.println("\t*");
            System.out.println("**********************************");
            System.out.println();
        }


    }

