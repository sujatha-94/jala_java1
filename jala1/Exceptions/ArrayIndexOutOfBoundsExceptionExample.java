package Exceptions;

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println(arr[5]);  // This will generate ArrayIndexOutOfBoundsException
    }
}
