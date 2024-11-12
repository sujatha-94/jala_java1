package MethodOverloading;

public class OverloadingExample {
    // Method with one parameter
    public void print(int a) {
        System.out.println("Method with one parameter: " + a);
    }

    // Method with two parameters
    public void print(int a, int b) {
        System.out.println("Method with two parameters: " + a + ", " + b);
    }

    public static void main(String[] args) {
        OverloadingExample obj = new OverloadingExample();
        obj.print(5);       // Calls method with one parameter
        obj.print(5, 10);   // Calls method with two parameters
    }
}

