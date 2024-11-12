package Exceptions;

public class ThrowExceptionWithMessage {
    public static void main(String[] args) {
        try {
            throw new Exception("Custom exception message");
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

