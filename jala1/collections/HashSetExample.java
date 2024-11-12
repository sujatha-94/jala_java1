package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet with at least 10 elements of type String
        HashSet<String> stringSet = new HashSet<>();
        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Cherry");
        stringSet.add("Date");
        stringSet.add("Elderberry");
        stringSet.add("Fig");
        stringSet.add("Grape");
        stringSet.add("Honeydew");
        stringSet.add("Kiwi");
        stringSet.add("Lemon");

        // Print the original HashSet
        System.out.println("Original HashSet: " + stringSet);

        // Add an element to the HashSet
        stringSet.add("Mango");
        System.out.println("After adding 'Mango': " + stringSet);

        // Remove an element from the HashSet
        stringSet.remove("Date");
        System.out.println("After removing 'Date': " + stringSet);

        // Check if an element is present in the HashSet
        boolean containsApple = stringSet.contains("Apple");
        System.out.println("HashSet contains 'Apple': " + containsApple);

        // Iterate through the HashSet using an Iterator
        System.out.print("Iterating through the HashSet: ");
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Check if the HashSet is empty
        boolean isEmpty = stringSet.isEmpty();
        System.out.println("HashSet is empty: " + isEmpty);

        // Find the size of the HashSet
        int size = stringSet.size();
        System.out.println("Size of the HashSet: " + size);

        // Clear all elements from the HashSet
        stringSet.clear();
        System.out.println("HashSet after clearing all elements: " + stringSet);

        // Check again if the HashSet is empty
        isEmpty = stringSet.isEmpty();
        System.out.println("HashSet is empty after clearing: " + isEmpty);
    }
}
