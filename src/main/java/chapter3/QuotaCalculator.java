package chapter3;

import java.util.Scanner;

//if-else statements
public class QuotaCalculator {

    public static void main(String[] args){
        int quota = 10;

        System.out.println("Enter the number of sales you made this week: ");

        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if(sales >= quota){
            System.out.println("Congrats! You're met your quota.");
        }
        else{
            int salesShort = quota - sales;
            System.out.println("You did not meet our quota. You were " + salesShort + " sales short");
        }

    }
}
