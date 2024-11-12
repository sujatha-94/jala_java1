
class Example {
    int number = 10;
    String text = "Hello, Java";

    // Instance method to print fields using 'this'
    void printFields() {
        System.out.println("Number: " + this.number); // Access instance variable with 'this'
        System.out.println("Text: " + this.text);     // Access instance variable with 'this'
    }

    // Main method to execute the code
    public static void main(String[] args) {
        new Example().printFields(); // Directly calls the instance method without an explicit object reference
    }
}

