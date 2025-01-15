import java.util.ArrayList;
import java.util.List;

public class StringPractice {
    public static void main(String[] args) {
        // Create a string with at least 5 characters and assign it to a variable
        String original = "Shams love Java";

        // Find the length of the string
        int length = original.length();
        System.out.println("Length of the string: " + length);

        // Concatenate (add) two strings together and reassign the result
        String additionalText = " and more!";
        original = original + additionalText;  // Concatenation
        System.out.println("Concatenated string: " + original);

        // Find the value of the character at index 3
        char charAtIndex3 = original.charAt(3);
        System.out.println("Character at index 3: " + charAtIndex3);

        // Check whether the string contains a given substring
        boolean containsSubstring = original.contains("Java");
        System.out.println("Does the string contain 'Java'? " + containsSubstring);

        // Iterate over the characters of the string, printing each one on a separate line
        System.out.println("Characters in the string:");
        for (int i = 0; i < original.length(); i++) {
            System.out.println(original.charAt(i)); // Prints each character on a separate line
        }

        // Create an ArrayList of Strings and assign it to a variable
        List<String> fruits = new ArrayList<>();

        // Add multiple strings to the List (OK to do one-by-one)
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Join all of the strings in the list together into a single string separated by commas
        String joinedFruits = String.join(", ", fruits);
        System.out.println("Joined fruits: " + joinedFruits);

        // Check whether two strings are equal
        String anotherString = "Shams love Java and more!";
        boolean areEqual = original.equals(anotherString);
        System.out.println("Are the two strings equal? " + areEqual);

        /*
         * Reminder!
         * 
         * When comparing objects in Java we typically want to use .equals, NOT ==.
         * 
         * We use == when comparing primitives (e.g. int or char).
         */
    }
}
