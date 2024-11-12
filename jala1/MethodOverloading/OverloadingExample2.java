package MethodOverloading;
public class OverloadingExample2 {
    // Method with one integer parameter
    public void display(int a) {
        System.out.println("Method with integer parameter: " + a);
    }

    // Method with one string parameter
    public void display(String text) {
        System.out.println("Method with string parameter: " + text);
    }

    public static void main(String[] args) {
        OverloadingExample2 obj = new OverloadingExample2();
        obj.display(100);          // Calls method with integer parameter
        obj.display("Hello World"); // Calls method with string parameter
    }
}
