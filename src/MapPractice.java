import java.util.HashMap;
import java.util.Map;

public class MapPractice {

    // Method to create and return a Map
    public static Map<String, Integer> createMap() {
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Elena", 27);
        ages.put("Demon", 30);
        ages.put("Shams", 23);
        return ages;
    }

    public static void main(String[] args) {
        // Create the map and populate it
        Map<String, Integer> myMap = createMap();

        // Get the value associated with a given key in the Map
        System.out.println("Age of Elena: " + myMap.get("Elena"));

        // Find the size (number of key/value pairs) of the Map
        System.out.println("Size of the map: " + myMap.size()); 
        // Replace the value associated with a given key
        myMap.put("Demon", 31); // Changing Demon’s age to 31
        System.out.println("Updated map: " + myMap); 

        // Check whether the Map contains a given key
        System.out.println("Does the map contain 'Shams'? " + myMap.containsKey("Shams"));

        // Check whether the Map contains a given value
        System.out.println("Does the map contain the value 30? " + myMap.containsValue(30)); 

        // Iterate over the keys of the Map, printing each key
        System.out.println("Keys in the map:");
        for (String key : myMap.keySet()) {
            System.out.println(key); 
        }

        // Iterate over the values of the map, printing each value
        System.out.println("Values in the map:");
        for (Integer value : myMap.values()) {
            System.out.println(value); 
        }

        // Iterate over the entries in the map, printing each key and value
        System.out.println("Entries in the map (key and value):");
        for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue()); 
        }
    
  




    /*
     * Usage tip!
     * 
     * Maps are great when you want a specific key to value mapping.
     * Example: The key could be a person's name, and the value could be their phone number
     * 
     * However if your keys are simple ascending 0-indexed integers with no gaps
     * (0, 1, 2, 3, 4...) then an array or List is likely a better choice.
     * Example: If you want to store the order of songs in a playlist.
     * 
     * If you're finding that you're just wanting to store unordered values and the keys
     * are unimportant, a Set may be a better choice.
     * Example: If you want to hold the student ID numbers of everyone in a course,
     * and you don't care about any ordering.
     */
  }
}
