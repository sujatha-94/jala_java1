

class Demo {
    int x;
    String y;

    // Constructor with one argument
    Demo(int x) {
        this(x, "Default String"); // Calls the two-argument constructor
        System.out.println("One-argument constructor called with x: " + x);
    }

    // Constructor with two arguments
    Demo(int x, String y) {
        this.x = x;
        this.y = y;
        System.out.println("Two-argument constructor called with x: " + x + ", y: " + y);
    }

    public static void main(String[] args) {
        new Demo(10); // Calls the one-argument constructor
    }
}

