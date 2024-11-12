class Parent1 {
    Parent1() {
        System.out.println("Parent class constructor called");
    }

    Parent1(String message) {
        System.out.println("Parent class constructor called with message: " + message);
    }
}

class Child extends Parent1 {
    Child() {
        super("Hello from Child"); // Calls the parent class constructor with an argument
        System.out.println("Child class constructor called");
    }

    public static void main(String[] args) {
        new Child(); // Calls the child class constructor, which calls the parent class constructor
    }
}

