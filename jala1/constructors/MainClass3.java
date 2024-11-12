package constructors;

class AccessModifiersExample {
    // Public constructor
    public AccessModifiersExample() {
        System.out.println("Public constructor called");
    }

    // Protected constructor
    protected AccessModifiersExample(int num) {
        System.out.println("Protected constructor called with num: " + num);
    }

    // Default (package-private) constructor
    AccessModifiersExample(String text) {
        System.out.println("Default constructor called with text: " + text);
    }

    // Private constructor
    private AccessModifiersExample(double value) {
        System.out.println("Private constructor called with value: " + value);
    }

    // Method to call the private constructor internally
    public static void createPrivateInstance() {
        new AccessModifiersExample(3.14);
    }
}

public class MainClass3 {
    public static void main(String[] args) {
        new AccessModifiersExample();             // Public constructor
        new AccessModifiersExample(10);           // Protected constructor
        new AccessModifiersExample("Hello");      // Default constructor

        // Call the private constructor indirectly
        AccessModifiersExample.createPrivateInstance();
    }
}

