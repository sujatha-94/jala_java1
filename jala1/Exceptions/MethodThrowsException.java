package Exceptions;
public class MethodThrowsException {
    public static void riskyMethod() throws ArithmeticException {
        throw new ArithmeticException("This is an exception from riskyMethod");
    }

    public static void main(String[] args) {
        // This will cause an unhandled exception to be thrown
        riskyMethod();
    }
}
