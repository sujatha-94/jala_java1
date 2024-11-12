public class Child extends AbstractExample {
    @Override
    void abstractMethod() {
        System.out.println("Abstract method implemented in the subclass.");
    }

    public static void main(String[] args) {
        // Create an instance of the child class
        Child obj = new Child();

        // Call the non-abstract method
        obj.nonAbstractMethod();
    }
}
