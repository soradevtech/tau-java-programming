package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String arg[]) {

        // Get hours
        System.out.println("Enter the number of hours the employee worked.");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        // Get rate
        System.out.println("Enter the employee's pay rate");
        double rate = scanner.nextDouble();
        scanner.close();

        // Multiply them together
        double grossPay = hours * rate;

        // Display the result
        System.out.println("The employee's gross pay is $" + grossPay);
    }
}
