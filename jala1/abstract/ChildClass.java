public class ChildClass extends AbstractExample {
    @Override
    void abstractMethod() {
        System.out.println("Abstract method implemented in the subclass.");
    }

    public static void main(String[] args) {
        // Create an instance of the subclass
        ChildClass obj = new ChildClass();

        // Call the abstract method implementation
        obj.abstractMethod();
    }
}
