package constructors;
class Example {
    // Default constructor
    Example() {
        System.out.println("Default constructor called");
    }

    // One-argument constructor
    Example(int num) {
        System.out.println("One-argument constructor called with num: " + num);
    }

    // Two-argument constructor
    Example(int num, String text) {
        System.out.println("Two-argument constructor called with num: " + num + ", text: " + text);
    }
}

public class MainClass {
    public static void main(String[] args) {
        Example obj1 = new Example();        // Calls default constructor
        Example obj2 = new Example(10);      // Calls one-argument constructor
        Example obj3 = new Example(20, "Hi"); // Calls two-argument constructor
    }
}
