package MethodOverloading;

public class OverloadingExample4 {
    // Method with an integer return type
    public int calculate(int a) {
        return a * a;
    }

    // This method is NOT allowed as it only differs by return type
    /*
    public double calculate(int a) {
        return (double) a * a;
    }
    */

    public static void main(String[] args) {
        OverloadingExample4 obj = new OverloadingExample4();
        int result = obj.calculate(5);
        System.out.println("Result: " + result);
    }
}

