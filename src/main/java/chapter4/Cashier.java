package chapter4;

import java.util.Scanner;

//FOR loop
public class Cashier {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of items you would like to scan: ");
        int quantity = scanner.nextInt();
        double total = 0;

        for(int i=0; i < quantity ; i++){
            System.out.println("Enter the cost of the item.");
            double price = scanner.nextDouble();
            total = total + price;
        }

        scanner.close();

        System.out.println("Your total is: $" + total);
    }
}
