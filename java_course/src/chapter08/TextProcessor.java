package chapter08;

public class TextProcessor {

    public static void main(String[] args) {
        countWords("I love Test Automation University");
        reverseString("Hello TAU!");
        addSpaces("Hello,World!ThisIsTracy");
    }

    /**
     * Splits a String into an array by tokenizing it
     * Counts the contained words and prints them out
     * @param text input string to be counted
     */
    public static void countWords(String text) {
        var words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words:", numberOfWords);
        System.out.println(message);

        for (int i = 0; i < numberOfWords; i++) {
            System.out.println(words[i]);
        }
    }

    /**
     * Reverses and prints the input string
     * @param text input string to be reversed
     */
    public static void reverseString(String text) {
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }

        System.out.println();
    }

    /**
     * Adds spaces before each uppercase letter in a string
     * @param text has jumbled spaceless text
     */
    public static void addSpaces(String text) {

        var modifiedText = new StringBuilder(text);

        for (int i = 0; i < modifiedText.length(); i++) {
            if(i != 0 && Character.isUpperCase(modifiedText.charAt(i))) {
                modifiedText.insert(i, " ");
                i++;
            }
        }

        System.out.println(modifiedText);
    }
}
