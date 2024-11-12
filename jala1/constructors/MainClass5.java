package constructors;

class Example {
    Example() {
        System.out.println("Constructor called");
    }

    void display() {
        System.out.println("Display method called");
    }
}

public class MainClass5 {
    public static void main(String[] args) {
        Example obj = new Example(); // Constructor called only once

        // Call the method multiple times
        obj.display();
        obj.display();
    }
}

