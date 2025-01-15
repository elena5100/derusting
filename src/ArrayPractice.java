

public class ArrayPractice {
  public static void main(String[] args) {
      // Create an array of Strings of size 4
      String[] fruits = new String[4];

      // Set the value of the array at each index to be a different String
      fruits[0] = "Apple";
      fruits[1] = "Banana";
      fruits[2] = "Cherry";
      fruits[3] = "Date";

      // Get the value of the array at index 2
      System.out.println("Element at index 2: " + fruits[2]); // Expected: Cherry

      // Get the length of the array
      System.out.println("Length of the array: " + fruits.length); // Expected: 4

      // Iterate over the array using a traditional for loop and print out each item
      System.out.println("Using traditional for loop:");
      for (int i = 0; i < fruits.length; i++) {
          System.out.println(fruits[i]); // Prints each fruit
      }

      // Iterate over the array using a for-each loop and print out each item
      System.out.println("Using for-each loop:");
      for (String fruit : fruits) {
          System.out.println(fruit); // Prints each fruit
      }
  }
}

