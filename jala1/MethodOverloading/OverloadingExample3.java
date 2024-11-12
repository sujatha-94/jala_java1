package MethodOverloading;

public class OverloadingExample3 {
    // Method with two integer parameters
    public void compute(int a, int b) {
        System.out.println("Sum of integers: " + (a + b));
    }

    // Method with two double parameters
    public void compute(double a, double b) {
        System.out.println("Sum of doubles: " + (a + b));
    }

    public static void main(String[] args) {
        OverloadingExample3 obj = new OverloadingExample3();
        obj.compute(5, 10);       // Calls method with integer parameters
        obj.compute(5.5, 10.5);   // Calls method with double parameters
    }
}
