package exercises;

import java.util.Random;

//TAU Exercise for chapter 4.
public class RollTheDie {
    public static void main(String[] args){
        Random random = new Random();
        int lastSpace = 20;
        int myCurrentSpace = 0;
        int maxRolls = 5;

        System.out.println("Welcome to Roll the Die game! Let's begin!");
        for (int i=0; i < maxRolls; i++){
            int die = random.nextInt(6)+ 1;
            myCurrentSpace = myCurrentSpace + die;
            System.out.println(String.format("Roll #%d: You've rolled a %d. You are on space: %d", (i+1), die, myCurrentSpace));
        }
        if(myCurrentSpace == lastSpace){
            System.out.println("Congrats! You are on space: "+lastSpace +". You win");
        } else if (myCurrentSpace > lastSpace) {
            System.out.println("Unfortunately, that takes you past " + lastSpace + " spaces. You lose!");
        }
        else {
            System.out.println("Unfortunately, you didn't make it to all " + lastSpace + " spaces. You lose!");
        }

    }
}
