package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 99;

    public static void main(String[] args){
        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);

    }
    public static int[] generateNumbers(){
        int[] ticket = new int[LENGTH];
        Random random = new Random();

        for(int i=0; i<LENGTH; i++){
            int randomNumber;
            do {
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;

            }while (search(ticket, randomNumber));
            ticket[i] = randomNumber;
        }
        return ticket;
    }
    public static void printTicket(int ticket[]){
        for (int index = 0; index < LENGTH; index++){
            System.out.print(ticket[index] + " | ");
        }
    }

    /**
     * Does a sequential search on the array to find a value
     * @param array Array to search
     * @param numberToSearchFor value to search for
     * @return true if found, false if not
     */
    public static boolean search(int[] array, int numberToSearchFor){

        //This is called enhanced loop. Iterates through array and each time assigns the current element to value
        for (int value : array){
            if (value == numberToSearchFor){
                return true;
            }
        }
        // if we've reached this point, then the entire array was searched, and the value was not found.
        return false;
    }

}
