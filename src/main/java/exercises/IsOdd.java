package exercises;

import java.util.Scanner;

public class IsOdd {
    public static void main(String[] arg){
        System.out.println("Enter an Integer number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i=1; i<=number; i++){
            if (i%2 != 0){
                System.out.println(i + "");
            }
        }

        scanner.close();
    }
}
