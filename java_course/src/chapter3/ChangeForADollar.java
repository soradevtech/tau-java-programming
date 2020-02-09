package chapter3;

// This is a game where we ask the user to input coins (pennies, nickels, etc.) that would add up to a dollar

import java.util.Scanner;

public class ChangeForADollar {
    public static void main(String args[]) {
        // Set up values for the coins
        double penny = .01;
        double nickel = .05;
        double dime = .10;
        double quarter = .25;
        double dollar = 1.00;

        // Ask the user to type in quantities of coins to add
        System.out.println("Please enter a quantity of pennies");
        Scanner scanner = new Scanner(System.in);
        int pennyQty = scanner.nextInt();

        System.out.println("Please enter a quantity of nickels");
        int nickelQty = scanner.nextInt();

        System.out.println("Please enter a quantity of dimes");
        int dimeQty = scanner.nextInt();

        System.out.println("Please enter a quantity of quarters");
        int quarterQty = scanner.nextInt();

        scanner.close();

        // Calculate the total from user input
        double total = (pennyQty * penny) + (nickelQty * nickel) + (dimeQty * dime) + (quarterQty * quarter);

        // Set a conditional to show the result
        if(total == dollar) {
            System.out.println("Congrats! Your change added up to exactly $1.00");
        } else if(total < dollar) {
            System.out.println("Your change is $" + (dollar - total) + " short of $1.00");
        } else {
            System.out.println("Your change is $" + (total - dollar) + " over $1.00");
        }
    }
}
