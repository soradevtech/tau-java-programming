package chapter02;

import java.util.Scanner;

public class MadLibs {
    public static void main(String args[]) {
        // Ask for a season
        System.out.println("Please enter a season of the year");
        Scanner scanner = new Scanner(System.in);
        var season = scanner.next();

        // Ask for an adjective
        System.out.println("Please enter an adjective");
        var adjective = scanner.next();

        // Ask for a whole number
        System.out.println("Please enter a whole number");
        int whNumber = scanner.nextInt();
        scanner.close();

        // Print out a string that uses the entered information
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + whNumber + " cups of coffee.");
    }
}
