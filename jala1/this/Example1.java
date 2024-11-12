

class Example1 {
    int number;
    String text;

    // No-argument constructor
    Example1() {
        this(42, "Hello"); // Calls the argument constructor of the current class
        System.out.println("No-argument constructor called");
    }

    // Argument constructor
    Example1(int number, String text) {
        this.number = number;
        this.text = text;
        System.out.println("Argument constructor called with number: " + number + ", text: " + text);
    }

    public static void main(String[] args) {
        new Example1(); // Calls the no-argument constructor, which in turn calls the argument constructor
    }
}
