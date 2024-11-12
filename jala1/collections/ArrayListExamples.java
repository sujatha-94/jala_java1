package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExamples {
    public static void main(String[] args) {
        // Create an ArrayList of Strings with 10 elements
        ArrayList<String> list = new ArrayList<String>();
        
        // Add 10 elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Grapes");
        list.add("Pineapple");
        list.add("Mango");
        list.add("Peach");
        list.add("Plum");
        list.add("Strawberry");
        list.add("Blueberry");
        
        // 1. Add an element to the ArrayList
        list.add("Watermelon");
        
        // 2. Iterate through the ArrayList using Iterator
        Iterator<String> iterator = list.iterator();
        System.out.println("Iterating through the ArrayList:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 3. Add an element at a specific index
        list.add(2, "Kiwi");
        
        // 4. Remove an element from the ArrayList by element
        list.remove("Mango");
        
        // Remove an element from the ArrayList by index
        list.remove(4); // Removes element at index 4
        
        // 5. Update the element at a specific index
        list.set(1, "Avocado");
        
        // 6. Check if the element is present at a particular index
        if (list.get(1).equals("Avocado")) {
            System.out.println("Element at index 1 is Avocado.");
        }
        
        // 7. Get an element at a particular index
        System.out.println("Element at index 2: " + list.get(2));
        
        // 8. Find out the size of the ArrayList
        System.out.println("Size of the ArrayList: " + list.size());
        
        // 9. Check if a specific element is present in the ArrayList
        if (list.contains("Peach")) {
            System.out.println("Peach is present in the ArrayList.");
        } else {
            System.out.println("Peach is not present in the ArrayList.");
        }
        
        // 10. Remove all elements of the ArrayList
        list.clear();
        System.out.println("ArrayList after removing all elements: " + list);
    }
}

