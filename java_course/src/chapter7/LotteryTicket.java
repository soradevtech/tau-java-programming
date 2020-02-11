package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args) {

        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);
    }

    public static int[] generateNumbers() {

        int[] ticket = new int[LENGTH];

        Random random = new Random();

        for (int i = 0; i < LENGTH; i++) {
            int randomNumber;

            /*
            Generate a random number and search after to make sure it does
            not already exist in the array. If it does, redo and search again.
             */
            do {
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            } while (search(ticket, randomNumber));

            // If the number is unique, we'll reach this point and it can be added to the array.
            ticket[i] = randomNumber;
        }

        return ticket;
    }

    /**
     * This is a sequential search on the array to match the current random number to existing indices
     * @param array
     * @param numberToSearchFor
     * @return true if found, false if not
     */
    public static boolean search(int[] array, int numberToSearchFor) {

        /* This is an enhanced loop that iterates through each individual index in
         * the array
         */
        for(int value : array) {
            if(value == numberToSearchFor) {
                return true;
            }
        }

        // If none of the array values meet the condition, return a false value
        return false;
    }

    // Example for binary search function. Unused in this class.
    public static boolean binarySearch(int[] array, int numberToSearchFor) {

        // Array must be sorted for binary search
        Arrays.sort(array);

        int index = Arrays.binarySearch(array, numberToSearchFor);

        if(index >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printTicket(int ticket[]) {
        for (int i = 0; i < LENGTH; i++) {
            System.out.print(ticket[i] + " | ");
        }
    }
}
