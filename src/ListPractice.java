import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class ListPractice {

    public static void main(String[] args) {
        // Create an empty ArrayList of Strings and assign it to a variable of type List
        List<String> myList = new ArrayList<>();

        // Add 3 elements to the list (OK to do one-by-one)
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Cherry");

        // Print the element at index 1
        System.out.println("Element at index 1: " + myList.get(1)); // Expected: Banana

        // Replace the element at index 1 with a new value
        myList.set(1, "Grapes"); // Replaces "Banana" with "Grapes"
        System.out.println("List after replacement: " + myList); // Expected: [Apple, Grapes, Cherry]

        // Insert a new element at index 0 (the length of the list will change)
        myList.add(0, "Orange"); // Inserts "Orange" at the beginning
        System.out.println("List after insertion: " + myList); // Expected: [Orange, Apple, Grapes, Cherry]

        // Check whether the list contains a certain string
        boolean containsApple = myList.contains("Apple");
        System.out.println("Does the list contain 'Apple'? " + containsApple); // Expected: true

        // Iterate over the list using a traditional for-loop.
        // Print each index and value on a separate line
        System.out.println("Using traditional for-loop:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("Index " + i + ": " + myList.get(i)); // Prints index and value
        }

        // Sort the list using the Collections library
        Collections.sort(myList); // Sorts the list alphabetically
        System.out.println("List after sorting: " + myList); // Expected: [Apple, Cherry, Grapes, Orange]

        // Iterate over the list using a for-each loop
        // Print each value on a second line
        System.out.println("Using for-each loop:");
        for (String item : myList) {
            System.out.println(item); // Prints each value on a new line
        }
    }
}
