package inter8;

public class PublicInterfaceClass implements PublicInterface {
    @Override
    public void displayValue() {
        System.out.println("The value of CONSTANT_VALUE is: " + CONSTANT_VALUE);
    }

    public static void main(String[] args) {
        PublicInterfaceClass obj = new PublicInterfaceClass();
        obj.displayValue();
    }
}

