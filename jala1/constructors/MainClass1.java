package constructors;

class Parent {
    // Default constructor
    Parent() {
        System.out.println("Parent class default constructor called");
    }

    // Argument constructor
    Parent(String message) {
        System.out.println("Parent class argument constructor called with message: " + message);
    }
}

class Child extends Parent {
    // Default constructor of child class calling default constructor of superclass
    Child() {
        super(); // Calls the default constructor of the superclass
        System.out.println("Child class default constructor called");
    }

    // Argument constructor of child class calling argument constructor of superclass
    Child(String message) {
        super(message); // Calls the argument constructor of the superclass
        System.out.println("Child class argument constructor called with message: " + message);
    }
}

public class MainClass1 {
    public static void main(String[] args) {
        Child child1 = new Child();         // Calls the default constructor of Parent and Child
        Child child2 = new Child("Hello");  // Calls the argument constructor of Parent and Child
    }
}
