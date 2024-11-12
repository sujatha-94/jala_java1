package Exceptions;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        String invalidNumber = "123abc";
        int num = Integer.parseInt(invalidNumber);  // This will generate NumberFormatException
    }
}
