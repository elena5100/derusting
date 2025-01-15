import java.util.HashSet;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {
        // Create a HashSet of Strings and assign it to a variable of type Set
        Set<String> mySet = new HashSet<>();

        // Add 3 elements to the set (It's OK to do it one-by-one)
        mySet.add("Strawberry");
        mySet.add("Grape");
        mySet.add("Banana");

        // Check whether the Set contains a given String
        System.out.println("Does the set contain 'Strawberry'? " + mySet.contains("Strawberry")); // Expected: true
        System.out.println("Does the set contain 'Apple'? " + mySet.contains("Apple")); // Expected: false

        // Remove an element from the Set
        mySet.remove("Grape"); // Removes "Grape" from the set
        System.out.println("Set after removing 'Grape': " + mySet);

        // Get the size of the Set
        System.out.println("Size of the set: " + mySet.size()); // Expected: 2

        // Iterate over the elements of the Set, printing each one on a separate line
        System.out.println("Elements in the set:");
        for (String fruit : mySet) {
            System.out.println(fruit); // Prints each fruit on a separate line
        }

        /*
         * Warning!
         * 
         * The iteration order over the items in a HashSet is NOT GUARANTEED.
         * Even running the exact same program multiple times may give different results.
         * Do not use a HashSet if order is important! You can use a TreeSet if you
         * want items in sorted order, or an array or List if you want them in a specified
         * order.
         * 
         * Also remember that sets do NOT have duplicates.
         */
    }
}
