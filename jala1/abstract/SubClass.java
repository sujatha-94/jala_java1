public class SubClass extends AbstractExample {
    // Implement the abstract method
    @Override
    void abstractMethod() {
        System.out.println("Abstract method implemented in the subclass.");
    }

    public static void main(String[] args) {
        // Create an object of the subclass
        SubClass obj = new SubClass();

        // Access the non-abstract method
        obj.nonAbstractMethod();
    }
}
