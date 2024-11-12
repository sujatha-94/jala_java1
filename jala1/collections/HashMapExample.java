package collections;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap with at least 10 key-value pairs of Student ID and Name
        HashMap<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "John");
        studentMap.put(102, "Alice");
        studentMap.put(103, "Bob");
        studentMap.put(104, "Charlie");
        studentMap.put(105, "Diana");
        studentMap.put(106, "Eve");
        studentMap.put(107, "Frank");
        studentMap.put(108, "Grace");
        studentMap.put(109, "Hank");
        studentMap.put(110, "Ivy");

        // Insert a key-value mapping into the map
        studentMap.put(111, "Jack");
        System.out.println("After adding a new key-value pair: " + studentMap);

        // Fetch the value of a key
        String name = studentMap.get(103);
        System.out.println("Value for key 103: " + name);

        // Create a clone/copy of the HashMap
        HashMap<Integer, String> clonedMap = (HashMap<Integer, String>) studentMap.clone();
        System.out.println("Cloned map: " + clonedMap);

        // Check if a given key is in the map
        boolean hasKey = studentMap.containsKey(104);
        System.out.println("Map contains key 104: " + hasKey);

        // Check if a given value is in the map
        boolean hasValue = studentMap.containsValue("Eve");
        System.out.println("Map contains value 'Eve': " + hasValue);

        // Check if the map is empty
        boolean isEmpty = studentMap.isEmpty();
        System.out.println("Map is empty: " + isEmpty);

        // Print the size of the map
        int size = studentMap.size();
        System.out.println("Size of the map: " + size);

        // Print all the keys of the map
        System.out.println("Keys of the map: " + studentMap.keySet());

        // Print all the values of the map
        System.out.println("Values of the map: " + studentMap.values());

        // Remove a specific key-value pair
        studentMap.remove(105);
        System.out.println("Map after removing key 105: " + studentMap);

        // Copy all the elements of the map to another map
        HashMap<Integer, String> newMap = new HashMap<>();
        newMap.putAll(studentMap);
        System.out.println("New map after copying all elements: " + newMap);
    }
}
