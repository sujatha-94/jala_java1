package Exceptions;

public class FinallyBlockExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException");
        } finally {
            System.out.println("This is the finally block and always executes.");
        }
    }
}
