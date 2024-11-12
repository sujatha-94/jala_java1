package Exceptions;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        int result = 10 / 0;  // This will generate an ArithmeticException
        System.out.println("Result: " + result);
    }
}
