package Exceptions;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        try {
            int arr[] = new int[5];
            arr[10] = 50;  // This will throw ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException");
        } catch (Exception e) {
            System.out.println("Caught a general exception");
        }
    }
}
